package com.springAI.ai.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface Assistant {
    @SystemMessage("You are a helpful Java backend assistant. Answer concisely and technically.")
    String chat(String userMessage);
}