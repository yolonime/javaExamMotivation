package com.example.motivational_chat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.motivational_chat.models.Quote;

import java.util.Optional;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

    @Query(value = "SELECT * FROM quote ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Optional<Quote> findRandomQuote();
    
    
    
    
}