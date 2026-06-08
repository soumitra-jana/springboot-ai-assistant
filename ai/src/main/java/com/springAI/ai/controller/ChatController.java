package com.springAI.ai.controller;

import com.springAI.ai.service.Assistant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @Autowired
    private Assistant assistant;

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        return assistant.chat(message);
    }
}