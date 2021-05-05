package com.ecommerce.customer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/")
    public ResponseEntity<?> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }
}