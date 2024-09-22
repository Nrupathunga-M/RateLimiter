package com.example.RateLimiter.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RateLimiterService {

    public ResponseEntity<String> toCheckGetMethod()
    {
        return ResponseEntity.ok("The RateLimiter is Tested");
    }

    public ResponseEntity<String> toCheckPostMethod()
    {
        return ResponseEntity.ok("Checking the Post Method");
    }

}
