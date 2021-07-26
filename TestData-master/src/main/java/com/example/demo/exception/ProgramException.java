package com.example.demo.exception;

public class ProgramException extends RuntimeException {

    private String message;

    private Throwable th;

    public ProgramException(String message, Throwable cause) {
        super(cause);
        this.message = message;
    }
}
