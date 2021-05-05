package com.ecommerce.customer.controller;

import com.ecommerce.customer.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @GetMapping("/test")
    public ResponseEntity<?> test(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }

    @PostMapping("/customers/{customerId}")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>("Customer added-" +  customer.getCustomerName(), HttpStatus.CREATED);
    }
}