package com.cipley.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleRestController {
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping("/hello-world")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World");
    }
}