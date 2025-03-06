package com.example.motivational_chat_app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.motivational_chat_app.model.Discussion;
import com.example.motivational_chat_app.service.DiscussionService;

import java.util.List;

@Controller
public class QuoteController {

    @Autowired
    private DiscussionService discussionService;

    @GetMapping("/admin")
    public String showUsers(Model model) {
        List<String> usernames = discussionService.getDistinctUsernames();
        model.addAttribute("usernames", usernames);
        return "admin";
    }

    @GetMapping("/admin/{username}")
    public String showUserDiscussions(@PathVariable String username, Model model) {
        List<Discussion> discussions = discussionService.getDiscussionsByUsername(username);
        model.addAttribute("discussions", discussions);
        model.addAttribute("username", username);
        return "user-discussions";
    }
}