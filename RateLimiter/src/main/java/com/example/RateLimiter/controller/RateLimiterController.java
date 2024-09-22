package com.example.RateLimiter.controller;

import com.example.RateLimiter.service.RateLimiterService;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.StandardEmitterMBean;
import java.lang.reflect.Method;

@RestController
public class RateLimiterController {

    @Autowired
    private RateLimiterService rateLimiterService;

    @GetMapping("/test")
    @RateLimiter(name = "userRateLimiter")
    public ResponseEntity<String> rateLimiterTest()
    {
        return rateLimiterService.toCheckGetMethod();
    }

    @PostMapping("/test2")
    @RateLimiter(name = "basic")
    public ResponseEntity<String> test()
    {
        return rateLimiterService.toCheckPostMethod();
    }
}
