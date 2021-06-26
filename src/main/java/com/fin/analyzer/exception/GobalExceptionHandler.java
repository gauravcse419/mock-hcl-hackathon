package com.fin.analyzer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GobalExceptionHandler {
    @ExceptionHandler(CustomerNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorResponse handle404Error(CustomerNotFoundException e) {
        return new ErrorResponse(e.getErrorCode(), e.getErrorMessage());

    }


    @ExceptionHandler(TransactionsNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorResponse errorForUpdate(TransactionsNotFoundException e) {
        return new ErrorResponse(e.getErrorCode(), e.getErrorMessage());

    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorResponse handle500Error() {
        return new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Unable to process the request please try after some time");

    }
}