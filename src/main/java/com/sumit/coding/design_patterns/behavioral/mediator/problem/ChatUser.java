package com.sumit.coding.design_patterns.behavioral.mediator.problem;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class ChatUser {

    @Getter
    private String name;
    private final List<ChatUser> contacts;

    public ChatUser(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public void addContacts(ChatUser user) {
        contacts.add(user);
    }

    public void sendMessage(String message, ChatUser recipient) {
        if (contacts.contains(recipient)) {
            System.out.println(this.name + " sends message to " + recipient.getName() + ": " + message);
            recipient.receiveMessage(message, this);
        } else
            System.out.println(this.name + " cannot send message to " + recipient.getName() + " (not in contacts).");
    }

    private void receiveMessage(String message, ChatUser sender) {
        System.out.println(this.name + " received message from " + sender.getName() + ": " + message);
    }
}
