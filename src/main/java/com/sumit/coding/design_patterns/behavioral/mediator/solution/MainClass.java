package com.sumit.coding.design_patterns.behavioral.mediator.solution;

import com.sumit.coding.design_patterns.behavioral.mediator.solution.mediator.impl.ChatRoom;
import com.sumit.coding.design_patterns.behavioral.mediator.solution.service.ChatUser;

public class MainClass {

    public static void main(String[] args) {
        // Create a chat room (mediator)
        ChatRoom chatRoom = new ChatRoom();

        // Create users and add them to the chat room
        ChatUser alice = new ChatUser("1", "Alice", chatRoom);
        ChatUser bob = new ChatUser("2", "Bob", chatRoom);
        ChatUser charlie = new ChatUser("3", "Charlie", chatRoom);

        // Alice sends a message to Bob
        alice.sendMessage("Hello Bob!", "2");

        // Bob sends a message to Charlie
        bob.sendMessage("Hi Charlie!", "3");

        // Charlie tries to send a message to a user who is not in the chat room
        charlie.sendMessage("Hey, Dave!", "4");  // Will fail since Dave is not part of the chat room
    }
}