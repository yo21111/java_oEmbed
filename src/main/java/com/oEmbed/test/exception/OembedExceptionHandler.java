package com.oEmbed.test.exception;

import com.oEmbed.test.dto.ErrorDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.reactive.function.UnsupportedMediaTypeException;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.time.LocalDateTime;

@Slf4j
@RestControllerAdvice
public class OembedExceptionHandler {

    @ExceptionHandler(UnsupportedMediaTypeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDto exceptionHandler(UnsupportedMediaTypeException ex) {
        log.info("예외 발생 UnsupportedMediaTypeException={}, 시간={}", ex.getMessage(), LocalDateTime.now());
        return new ErrorDto("UnsupportedMediaTypeException", 400, ex.getMessage());
    }

    @ExceptionHandler(WebClientResponseException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDto exceptionHandler(WebClientResponseException ex) {
        log.info("예외 발생 WebClientResponseException={}, 시간={}", ex.getMessage(), LocalDateTime.now());
        return new ErrorDto("WebClientResponseException", 400, ex.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDto exceptionHandler(IllegalArgumentException ex) {
        log.info("예외 발생 IllegalArgumentException={}, 시간={}", ex.getMessage(), LocalDateTime.now());
        return new ErrorDto("IllegalArgumentException", 400, ex.getMessage());
    }
}
