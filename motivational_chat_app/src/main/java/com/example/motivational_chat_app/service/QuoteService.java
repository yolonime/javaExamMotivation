package com.example.motivational_chat_app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {
    @Autowired
    private RestTemplate restTemplate;

    public String getRandomQuote() {
        String apiUrl = "http://localhost:8081/api/quotes";
        return restTemplate.getForObject(apiUrl, String.class);
    }
}