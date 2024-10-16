package com.sumit.coding.design_patterns.behavioral.mediator.problem;

public class MainClass {

    public static void main(String[] args) {
        ChatUser alice = new ChatUser("Alice");
        ChatUser bob = new ChatUser("Bob");
        ChatUser charlie = new ChatUser("Charlie");

        alice.addContacts(charlie);
        bob.addContacts(charlie);
        charlie.addContacts(alice);
        charlie.addContacts(bob);

        alice.sendMessage("hello! Bob", bob); // can't send message
        alice.sendMessage("hello! Charlie", charlie);
        System.out.println();
        bob.sendMessage("hello! Alice", alice); // can't send message
        bob.sendMessage("hello! Charlie", charlie);
        System.out.println();
        charlie.sendMessage("hello! Alice", alice);
        charlie.sendMessage("hello! Bob", bob);
    }
}


/*
 * Issues in This Scenario:
 *
 *	1. Tight Coupling:
 *	• Each user must directly reference and maintain a list of other users (contacts). If one user changes, the others need to adjust their contacts as well.
 *	• For instance, if the user “Alice” wants to communicate with “Charlie”, she needs to explicitly have Charlie in her contacts.
 *	2. Scalability:
 *	• As the number of users increases, each user has to manage more and more contacts. This leads to complex management of communication.
 *	• Imagine a scenario where there are 100+ users; each one would need to know about the others explicitly.
 *	3. Difficult to Maintain:
 *	• When adding new features (e.g., broadcasting a message to multiple users), it becomes difficult to change the communication flow without modifying every user class.
 *	• If the message routing logic changes, it would require updating all the users to accommodate the new behavior.
 *	4. Lack of Flexibility:
 *	• The current setup is rigid and doesn’t allow for easy addition of new behaviors (like group messaging, message filtering, etc.), since everything is managed within each user’s own logic.
 *
 * What Would a Mediator Do?
 *
 * In a system using the Mediator Design Pattern, the direct communication between users is replaced by a ChatRoom mediator.
 * This mediator handles the logic of passing messages between users, so users no longer need to know about each other, reducing complexity and decoupling them from one another.
 * */