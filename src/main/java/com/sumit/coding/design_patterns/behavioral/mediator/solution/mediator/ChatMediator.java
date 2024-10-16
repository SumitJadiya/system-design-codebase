package com.sumit.coding.design_patterns.behavioral.mediator.solution.mediator;


import com.sumit.coding.design_patterns.behavioral.mediator.solution.service.ChatUser;

public interface ChatMediator {

    void sendMessage(String message, String senderId, String recipientId);

    void addUser(ChatUser user);
}
