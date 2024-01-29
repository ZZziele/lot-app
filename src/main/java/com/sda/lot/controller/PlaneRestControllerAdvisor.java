package com.sda.lot.controller;

import com.sda.lot.dto.ResponseDto;
import com.sda.lot.excepiton.WrongPlaneIdException;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.HttpStatus;
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
        String path = ServletUriComponentsBuilder.fromCurrentRequest()
                .build()
                .getPath();
        return ResponseDto.builder()
                .timestamp(LocalDateTime.now())
                .status(404)
                .error("Not Found")
                .message(exc.getMessage())
                // TODO get path
                .path(path)
                .build();
    }
}
