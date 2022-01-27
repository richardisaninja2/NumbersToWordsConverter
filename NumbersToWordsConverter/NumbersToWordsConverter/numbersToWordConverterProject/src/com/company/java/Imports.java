import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Imports {

    public List importsToList(File file) throws IOException {
        //importing the files and turning them into a list;
        List<String> list = new ArrayList<>(Files.readAllLines(Paths.get(String.valueOf(file))));
        return list;
    }

//    public List oneToTwentyFiveImports() throws IOException {
//        //importing the files and turning them into a list;
//        File file = new File("src/com/company/resources/OneToTwentyFive.txt");
//        List<String> list = new ArrayList<>(Files.readAllLines(Paths.get(String.valueOf(file))));
//        return list;
//    }
}
