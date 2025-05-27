package com.kodilla.exception.main;
import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
        try {
            fileReader.readFile("names.txt");
        } catch(FileReaderException fre) {
            System.out.println(fre.getMessage());
        }
    }
}
