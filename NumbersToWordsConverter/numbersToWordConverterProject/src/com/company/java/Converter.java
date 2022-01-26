import java.io.IOException;

public interface Converter {
    String convertFileToString() throws IOException;
    void stringToFile() throws IOException;
}
