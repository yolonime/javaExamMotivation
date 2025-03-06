package com.example.motivational_chat.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.motivational_chat.models.Quote;
import com.example.motivational_chat.repositories.QuoteRepository;

import java.util.Optional;

@RestController
@RequestMapping("/api/quotes")
public class QuoteControllers {

    private final QuoteRepository quoteRepository;

    public QuoteControllers(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping
    public String getRandomQuote() {
        Optional<Quote> randomQuote = quoteRepository.findRandomQuote();
        return randomQuote.map(quote -> String.format("« %s » - %s", quote.getText(), quote.getAuthor()))
                          .orElse("Aucune citation disponible.");
    }
    
    
}