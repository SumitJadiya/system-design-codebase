package com.sumit.coding.design_patterns.behavioral.template.solution;

public class MainClass {

    public static void main(String[] args) {
        OrderProcessTemplate onlineOrder = new OnlineOrder();
        System.out.println("Processing online order:");
        onlineOrder.processOrder();

        System.out.println("\nProcessing in-store order:");
        OrderProcessTemplate inStoreOrder = new InStoreOrder();
        inStoreOrder.processOrder();
    }
}

/*
 * Key Points:
 *
 *	1. Template Method (processOrder) is final to prevent modification by subclasses. It defines the skeleton of the algorithm.
 *	2. Steps of the algorithm are defined in abstract methods like selectItem(), makePayment(), and deliver(), which must be implemented by subclasses.
 *	3. Hook methods like isGift() allow the subclasses to influence the flow of the algorithm (e.g., whether to gift wrap or not).
 *	4. The algorithm structure is reused across multiple concrete classes, while specific steps can differ depending on the subclass.
 *
 * When to Use Template Method Pattern:
 *
 *	• When you have multiple implementations of an algorithm that share some steps but differ in others.
 *	• When you want to avoid code duplication by moving common code to a base class and allow subclasses to define the variable parts.
 *	• When an algorithm’s structure should remain unchanged, but some details need to vary.
 * */
