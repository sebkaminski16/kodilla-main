package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {
    public Optional<Stream<String>> readFile(String filename) throws FileReaderException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource(filename)).getFile());
        try {
            Path pathUrl = Paths.get("hmm");
            return Optional.of(Files.lines(pathUrl));
        } catch (IOException e) {
            throw new FileReaderException(e);
        }
    }
}
