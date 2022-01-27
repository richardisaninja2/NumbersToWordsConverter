import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        ConvertListOneToSevenToColumns convertListToColumns = new ConvertListOneToSevenToColumns();
        ConvertOneToTwentyFiveToColumns convertOneToTwentyFiveToColumns = new ConvertOneToTwentyFiveToColumns();
        convertListToColumns.stringToFile();
        convertOneToTwentyFiveToColumns.stringToFile();

    }
}
