package com.company.prime.service.event;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Random;

@Service
public class PrimeService {
    public BigInteger generatePrime(int numBits){
        BigInteger probablePrime = BigInteger.probablePrime(numBits, new Random());;
        return probablePrime;
    }
}
