package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class FileReader {
    public Optional<Stream<String>> readFile(String filename) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource(filename)).getFile());
        Path pathUrl = Paths.get(file.getPath());
        try {
            return Optional.of(Files.lines(pathUrl));
        } catch(IOException error) {
            System.out.println("IO EXCEPTION!!");
            return Optional.empty();
        } finally {
            System.out.println("Prints no matter what");
        }
    }
}
