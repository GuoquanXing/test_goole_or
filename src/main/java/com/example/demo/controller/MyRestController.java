package com.example.demo.controller;

import com.example.demo.OptimizationService;
import com.example.demo.model.OptimizationResult;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyRestController {
    @Autowired
    OptimizationService optimizationService;

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.status(HttpStatus.OK).body("{'msg':'This is a greeting'}");
    }

    @GetMapping("/defaultLP")
    public OptimizationResult callDefaultLP(){
       return optimizationService.callLinearProgramming();
    }
}
