package com.example.motivational_chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.motivational_chat.models") // Add this line
public class MotivationalChatApplication {
    public static void main(String[] args) {
        SpringApplication.run(MotivationalChatApplication.class, args);
    }
}