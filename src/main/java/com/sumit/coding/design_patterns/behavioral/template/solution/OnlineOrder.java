package com.sumit.coding.design_patterns.behavioral.template.solution;

public class OnlineOrder extends OrderProcessTemplate {

    @Override
    protected void selectItem() {
        System.out.println("Item selected from online store");
    }

    @Override
    protected void makePayment() {
        System.out.println("Payment made online");
    }

    @Override
    protected void deliver() {
        System.out.println("Item shipped to home");
    }

    @Override
    protected boolean isGift() {
        return true;  // Online order can be a gift
    }
}
