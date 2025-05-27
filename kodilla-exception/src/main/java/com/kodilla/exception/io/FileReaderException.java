package com.kodilla.exception.io;

public class FileReaderException extends Exception {
    Exception exception;
    public FileReaderException(Exception e) {
        this.exception = e;
    }

    @Override
    public String getMessage() {
        return "FILE READER EXCEPTION: " + exception.getMessage();
    }
}
