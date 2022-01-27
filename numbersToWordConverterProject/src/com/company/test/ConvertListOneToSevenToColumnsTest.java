import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ConvertListOneToSevenToColumnsTest {
    ConvertListOneToSevenToColumns convertListOneToSevenToColumns;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        convertListOneToSevenToColumns = new ConvertListOneToSevenToColumns();
    }

    @org.junit.jupiter.api.Test
    void oneToSevenToArrayList() throws IOException {
        String aString = "One Five\n" +
                "Two Six\n" +
                "Three Seven\n" +
                "Seven";

        System.out.println(aString);

        assertEquals(aString, convertListOneToSevenToColumns.convertFileToString(), "Should return correct String.");
        assertNotEquals("", convertListOneToSevenToColumns.convertFileToString());
    }

    @Test
    void stringToFile() throws IOException {
        String aString = "One Five\n" +
                "Two Six\n" +
                "Three Seven\n" +
                "Seven";
        assertEquals(aString, convertListOneToSevenToColumns.stringToFile());
        assertNotEquals("", convertListOneToSevenToColumns.stringToFile());

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}