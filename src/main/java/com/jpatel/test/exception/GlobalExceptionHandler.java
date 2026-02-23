package com.jpatel.test.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AppException.class)
    public ResponseEntity<String> handleAppError(AppException error) {
        return ResponseEntity.status(error.getStatusCode()).body(error.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception error) {
        return ResponseEntity.status(500).body(error.getMessage());
    }
}
