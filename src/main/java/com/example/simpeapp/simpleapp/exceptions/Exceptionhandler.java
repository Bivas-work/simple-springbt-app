package com.example.simpeapp.simpleapp.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class Exceptionhandler {



    @ExceptionHandler(CustomExceptions.class)
    public void customExceptionhandler(CustomExceptions e) {
        log.error("Custom error detected" + e.getLocalizedMessage());

    }
}
