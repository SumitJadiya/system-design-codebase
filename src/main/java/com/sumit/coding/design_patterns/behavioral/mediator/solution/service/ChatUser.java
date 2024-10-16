package com.sumit.coding.design_patterns.behavioral.mediator.solution.service;

import com.sumit.coding.design_patterns.behavioral.mediator.solution.mediator.ChatMediator;
import lombok.Getter;

public class ChatUser {

    @Getter
    private String id;
    @Getter
    private String name;
    private ChatMediator chatRoom;

    public ChatUser(String id, String name, ChatMediator chatRoom) {
        this.id = id;
        this.name = name;
        this.chatRoom = chatRoom;
        chatRoom.addUser(this);
    }

    // Send a message via the chat room (mediator)
    public void sendMessage(String message, String recipientId) {
        System.out.println(this.name + " sends message to User with ID: " + recipientId + ": " + message);
        chatRoom.sendMessage(message, this.id, recipientId);
    }

    // Receive a message
    public void receiveMessage(String message, String senderId) {
        System.out.println(this.name + " received message from User with ID: " + senderId + ": " + message);
    }
}
