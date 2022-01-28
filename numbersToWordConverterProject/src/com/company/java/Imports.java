import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Imports {
    // class for importing the files and turning them into a list;

    public List importsToList(File file) throws IOException {

        List<String> list = new ArrayList<>(Files.readAllLines(Paths.get(String.valueOf(file))));
        return list;
    }
}
