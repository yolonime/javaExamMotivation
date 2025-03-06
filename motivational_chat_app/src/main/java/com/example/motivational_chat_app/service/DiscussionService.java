package com.example.motivational_chat_app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.motivational_chat_app.model.Discussion;
import com.example.motivational_chat_app.repositories.DiscussionRepository;

import java.util.List;

@Service
public class DiscussionService {
    @Autowired
    private DiscussionRepository discussionRepository;

    @Autowired
    private QuoteService quoteService;

    // Enregistrer une conversation
    public Discussion saveDiscussion(String username, String message) {
        String response = quoteService.getRandomQuote();

        Discussion discussion = new Discussion();
        discussion.setUsername(username);
        discussion.setMessage(message);
        discussion.setQuote(response);

        return discussionRepository.save(discussion);  // Sauvegarde la discussion
    }

    // Récupérer toutes les discussions
    public List<Discussion> getAllDiscussions() {
        return discussionRepository.findAll();  // Retourne toutes les discussions
    }
    
    public List<String> getDistinctUsernames() {
        return discussionRepository.findDistinctUsernames();
    }

    public List<Discussion> getDiscussionsByUsername(String username) {
        return discussionRepository.findByUsername(username);
    }

}
