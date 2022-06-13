package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyRestController {

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.status(HttpStatus.OK).body("{'msg':'This is a greeting'}");
    }
}