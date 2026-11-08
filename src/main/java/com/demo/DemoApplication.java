package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello! Java application deployed using AWS CI/CD!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }

    @GetMapping("/version")
    public String version() {
        return "Version 1.0";
    }
}