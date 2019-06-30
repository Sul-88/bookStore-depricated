package com.sul.bookstore.exception;

public class RegistrationException extends Exception {

    private String message;

    public RegistrationException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

}
