package com.example.demo.Dto;

public record ErrorResponse(
        int status,
        String message,
        String details) {

}
