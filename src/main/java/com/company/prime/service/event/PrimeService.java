package com.company.prime.service.event;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.SecureRandom;

@Service
public class PrimeService {
    public BigInteger generatePrime(int numBits){
        SecureRandom random = new SecureRandom();
        BigInteger bigInteger = new BigInteger(numBits, random);
        return bigInteger;
    }
}
