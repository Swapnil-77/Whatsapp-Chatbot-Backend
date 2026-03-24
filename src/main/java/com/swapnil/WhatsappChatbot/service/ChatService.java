package com.swapnil.WhatsappChatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {

        if (message == null) {
            return "Invalid message";
        }

        String msg = message.trim().toLowerCase();

        if (msg.equals("hi")) {
            return "Hello";
        } else if (msg.equals("bye")) {
            return "Goodbye";
        } else {
            return "I don't understand";
        }
    }
}