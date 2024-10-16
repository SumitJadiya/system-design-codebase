package com.sumit.coding.design_patterns.behavioral.mediator.solution.mediator.impl;

import com.sumit.coding.design_patterns.behavioral.mediator.solution.mediator.ChatMediator;
import com.sumit.coding.design_patterns.behavioral.mediator.solution.service.ChatUser;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements ChatMediator {

    private final Map<String, ChatUser> users = new HashMap<>();

    @Override
    public void sendMessage(String message, String senderId, String recipientId) {
        ChatUser recipient = users.get(recipientId);

        if (recipient != null)
            recipient.receiveMessage(message, senderId);
        else
            System.out.println("User with ID: " + recipientId + " not found in the chat room.");
    }

    @Override
    public void addUser(ChatUser user) {
        users.put(user.getId(), user);
    }
}
