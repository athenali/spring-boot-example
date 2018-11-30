package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.printf(
                "\n----------------------------------------------------------\n\t"
                        + "Application is running! Access URLs:\n\t"
                        + "Local: \t\thttp://localhost:9999\n\t"
                        + "\n----------------------------------------------------------\n"
        );
    }
}
