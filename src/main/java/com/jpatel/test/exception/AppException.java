package com.jpatel.test.exception;

public class AppException extends RuntimeException {

    final private int statusCode;

    public AppException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

}
