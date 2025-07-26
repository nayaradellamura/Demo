package com.rpg.demo.campanhaParticipante.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = "com.rpg.demo.campanhaParticipante")
public class CampanhaPartExceptionHandler {

    @ExceptionHandler(IllegalArgumentException. class)
    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("Erro: " + ex.getMessage());
    }
}
