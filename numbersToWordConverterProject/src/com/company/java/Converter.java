import java.io.IOException;

public interface Converter {
    String convertFileToString() throws IOException;
    String stringToFile() throws IOException;
}
