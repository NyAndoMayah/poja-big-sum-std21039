package com.company.prime.endpoint.rest.controller;

import com.company.prime.service.event.PrimeService;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertTrue;

public class PrimeControllerIT {
    PrimeService service;
    @Test
    public void testGenerateBigInteger() {
        int numBits = 10000;
        BigInteger bigInteger = service.generatePrime(numBits);

        assertTrue(bigInteger != null);
        assertTrue(bigInteger.bitLength() == numBits);
    }
}
