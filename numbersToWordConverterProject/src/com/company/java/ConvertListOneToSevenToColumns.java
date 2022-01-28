import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOneToSevenToColumns implements Converter{
    public String convertFileToString() throws IOException {

        /*
         * This method receives A list  of Strings that is comping from the OneToSeven.txt file
         * This method is intended for 1 to  7 lines, but can be adjusted.
         * This method will read the current line of the file. Starting with line 1.
         * Next, find the next line in increments of 4 and append to line 1.
         * For example, lines 1, 5 append to create one String
         * This string will be then added to an arrayList called wordsByColumn
         * The final Line will then be added to the list to prevent a IndexOutOfBounds exception
         * then the list is then joined to be converted into a String to be processed into a file
         * Then write the new String to another file.
         * In the file write you truncate the previous entry
         */

        Imports imports = new Imports();
        List <String> list = imports.importsToList(new File("src/com/company/resources/OneToSeven.txt"));
        ArrayList<String> wordsByColumns = new ArrayList<>();

        int i = 0;
        int columns = (int)Math.floor(list.size() / 2);
        while(i < columns){
            //combine the first and third word from the original list (not the last word... it'll throw and exception) and add them to a new ArrayList
            wordsByColumns.add(list.get(i) +" "+list.get(i + 4) + "\n");
            i++;
        }
        //add the last number from the original list into the list
        wordsByColumns.add(list.get(list.size() - 1));

        //return the arrayList we just created so that it can be processed into a file
        String string = wordsByColumns.stream().collect(Collectors.joining(""));
        return string;
    }

    public String stringToFile() throws IOException {
        //convert the final Arraylist containing the matched strings to a string
        String finalString = convertFileToString();
        //write to a file the results
        Files.write(Paths.get("src/com/company/resources/OneToSevenSolution.txt"), Collections.singleton(finalString), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        return finalString;
    }

}
