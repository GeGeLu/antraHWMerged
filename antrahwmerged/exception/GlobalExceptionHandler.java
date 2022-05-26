package com.example.antrahwmerged.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Throwable.class)
    public ResponseEntity handleRuntimeException() {
        return new ResponseEntity("global exception", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
