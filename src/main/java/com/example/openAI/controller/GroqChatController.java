package com.example.openAI.controller;

import com.example.openAI.entity.ChatRequest;
import com.example.openAI.services.GropChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class GroqChatController {

    @Autowired
  private GropChatService gropChatService;

    @PostMapping
    public String chatWithGroq(@RequestBody ChatRequest request){
        return gropChatService.chat(request.getMessage());
    }
}
