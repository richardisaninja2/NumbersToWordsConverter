import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImportsTest {
    Imports imports;

    @BeforeEach
    void setUp() {
        imports = new Imports();
    }

    @Test
    void importsToList() throws IOException {
        File aFile = new File("src/com/company/resources/text.txt");
        List<String> myList = new ArrayList<>(Arrays.asList("a"));
        List<String> emptyList = new ArrayList<>(Arrays.asList(""));

        assertEquals(myList, imports.importsToList(aFile));
        assertNotEquals(emptyList, imports.importsToList(aFile));
    }

    @AfterEach
    void tearDown() {
    }
}