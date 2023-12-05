package com.company.prime.endpoint.rest.controller;

import com.company.prime.service.event.PrimeService;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@Value
public class PrimeController {
    PrimeService primeService;
    @GetMapping("/new-prime")
    public BigInteger new_prime(){
        int numBits = 10000;
        return primeService.generatePrime(numBits);
    }
}
