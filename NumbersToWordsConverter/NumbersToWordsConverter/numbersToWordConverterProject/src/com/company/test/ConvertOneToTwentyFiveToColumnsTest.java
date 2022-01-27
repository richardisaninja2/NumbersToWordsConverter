import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ConvertOneToTwentyFiveToColumnsTest {
    ConvertOneToTwentyFiveToColumns convertOneToTwentyFiveToColumns;

    @BeforeEach
    void setUp() {
        convertOneToTwentyFiveToColumns = new ConvertOneToTwentyFiveToColumns();
    }

    @Test
    void oneToTwentyFive() throws IOException {
        String aString = "one ten nineteen\n" +
                "two eleven twenty\n" +
                "three twelve twenty one\n" +
                "four thirteen twenty two\n" +
                "five fourteen twenty three\n" +
                "six fifteen twenty four\n" +
                "seven sixteen twenty five\n" +
                "eight seventeen\n" +
                "nine eighteen\n";

        System.out.println(aString);
        
        assertEquals(aString, convertOneToTwentyFiveToColumns.convertFileToString(), "Should return correct String.");
    }

    @AfterEach
    void tearDown() {
    }
}