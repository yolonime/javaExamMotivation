package com.example.motivational_chat_app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.motivational_chat_app.model.Discussion;
import com.example.motivational_chat_app.service.DiscussionService;

@Controller
public class DiscussionController {
    @Autowired
    private DiscussionService discussionService;

    @GetMapping("/chat")
    public String showChat() {
        return "chat";  // Affiche la vue chat.html
    }

    @PostMapping("/sendMessage")
    public String sendMessage(@RequestParam String username, @RequestParam String message, Model model) {
        // Enregistrer la discussion et obtenir la réponse
        Discussion discussion = discussionService.saveDiscussion(username, message);
        model.addAttribute("response", discussion.getQuote());
        return "chat";  // Rediriger vers la même vue pour afficher la réponse
    }

    @GetMapping("/discussion")
    public String showDiscussions(Model model) {
        List<Discussion> discussions = discussionService.getAllDiscussions();
        model.addAttribute("discussions", discussions);
        return "discussions";  // Retourne la vue 'discussions.html' pour afficher les discussions passées
    }
}

