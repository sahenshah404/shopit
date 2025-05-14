package com.shopit.customers.controller;

import com.shopit.customers.dto.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("api/customers")
public class CustomerController {

    @GetMapping
    public ResponseEntity<CustomerDto> getCustomer() {
        return null;
    }

    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
        
    }
}
