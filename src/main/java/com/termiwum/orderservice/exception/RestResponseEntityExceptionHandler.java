package com.termiwum.orderservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.termiwum.orderservice.external.response.ErrorResponse;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {

    public ResponseEntity<ErrorResponse> handleCustomException(CustomException exception) {
        return new ResponseEntity<>(
                new ErrorResponse()
                        .builder()
                        .errorMessage(exception.getMessage())
                        .errorCode(exception.getErrorCode())
                        .build(),
                HttpStatus.valueOf(exception.getStatus()));
    }
}
