package com.example.motivational_chat_app.repositories;

import com.example.motivational_chat_app.model.Discussion;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DiscussionRepository extends JpaRepository<Discussion, Long> {
	
	 List<Discussion> findByUsername(String username);

	    @Query("SELECT DISTINCT d.username FROM Discussion d")
	    List<String> findDistinctUsernames();
}