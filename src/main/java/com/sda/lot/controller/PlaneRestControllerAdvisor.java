package com.sda.lot.controller;

import com.sda.lot.dto.ResponseDto;
import com.sda.lot.excepiton.WrongPlaneIdException;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDateTime;

@RestControllerAdvice
@Slf4j

public class PlaneRestControllerAdvisor {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(WrongPlaneIdException.class)
    public ResponseDto  handlePlaneNotFoundException(WrongPlaneIdException exc){
        String path = getCurrentRequestPath();
        return ResponseDto.builder()
                .timestamp(LocalDateTime.now())
                .status(404)
                .error("Not Found")
                .message(exc.getMessage())
                // TODO get path
                .path(path)
                .build();
    }

    private static String getCurrentRequestPath() {
        return ServletUriComponentsBuilder.fromCurrentRequest()
                .build()
                .getPath();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseDto handleBadRequest(MethodArgumentNotValidException exc){
        
    return ResponseDto.builder()
            .timestamp(LocalDateTime.now())
            .status(HttpStatus.BAD_REQUEST.value())
            .error(HttpStatus.BAD_REQUEST.getReasonPhrase())
            .message(exc.getMessage())
            .path(getCurrentRequestPath())
            .build();
    }
}

