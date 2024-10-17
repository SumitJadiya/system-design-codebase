package com.sumit.coding.design_patterns.behavioral.template.solution;

public class InStoreOrder extends OrderProcessTemplate {

    @Override
    protected void selectItem() {
        System.out.println("Item selected from physical store");
    }

    @Override
    protected void makePayment() {
        System.out.println("Payment made at checkout");
    }

    @Override
    protected void deliver() {
        System.out.println("Customer takes the item home");
    }

    @Override
    protected boolean isGift() {
        return false; // In-store orders are usually not gifts
    }
}
