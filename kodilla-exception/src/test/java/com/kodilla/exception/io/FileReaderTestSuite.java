package com.kodilla.exception.io;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {
    @Test
    void testReadFile() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertDoesNotThrow(() -> fileReader.readFile("names.txt"));
    }

    @Test
    void testReadFile2() {
        // given
        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
        //when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile("names.txt"));
    }
}
