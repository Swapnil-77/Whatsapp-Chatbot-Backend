package com.swapnil.WhatsappChatbot.controller;

import com.swapnil.WhatsappChatbot.dto.MessageRequest;
import com.swapnil.WhatsappChatbot.dto.MessageResponse;
import com.swapnil.WhatsappChatbot.service.ChatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public MessageResponse receiveMessage(@RequestBody MessageRequest request) {

        // Logging
        System.out.println("Incoming message: " + request.getMessage());

        String reply = chatService.getReply(request.getMessage());

        return new MessageResponse(reply);
    }
}