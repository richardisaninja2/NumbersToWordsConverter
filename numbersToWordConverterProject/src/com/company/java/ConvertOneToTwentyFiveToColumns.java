import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertOneToTwentyFiveToColumns {

    /*
     * This method is intended for 1 to  25 lines, but can be adjusted.
     * This method will read the current line of the file. Starting with line 1.
     * Next, find the next two lines in increments of 9 and append to line 1.
     * For example, lines 1, 10, and 19 will append to create one String
     * Then write the new String to another file.
     * This loop end before and IndexOutOfBounds is achieved.
     */
    public String oneToTwentyFive() throws IOException {
        //Create list containing 25 elements
        Imports imports = new Imports();
        List<String> myList = imports.oneToTwentyFiveImports();

        //This loop will read the current line and append the next 2 lines that are increments of 9.
        //Ex: String newString = Line 1 + line 10 + line 19
        //newString will be written to a new file and loop until done.

        ArrayList<String> finalListFormat = new ArrayList<>();

        for(int i = 0; i<7 ; i++){
            //add in the list objects from index i + (index i + 9) + (index i + 18)
            finalListFormat.add(myList.get(i)+" "+ myList.get(i+9)+" "+ myList.get(i+18)+"\n");
        }
        //add the last indexes to the arrayList (index 7-9 only have 2 columns)
        for(int i = 7; i < 9; i++){
            finalListFormat.add(myList.get(i)+" "+ myList.get(i + 9)+"\n");
        }
        //turn the finalListFormat into a string to print to a new page
        String finalStringFormat = finalListFormat.stream().collect(Collectors.joining(""));


        return finalStringFormat;

    }

    public void OneToTwentyFiveArrayListToFile() throws IOException{
        String finalStringFormat = oneToTwentyFive();
        //now export to a OneToTRwentyFiveSolution.txt truncating the previous entry
        //Write list to a file.
        Files.write(Paths.get("src/com/company/resources/OneToTwentyFiveSolution.txt"), Collections.singleton(finalStringFormat), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

}
