package com.sumit.coding.design_patterns.behavioral.template.solution;

abstract class OrderProcessTemplate {

    // Template method
    public final void processOrder() {
        selectItem();
        makePayment();
        if (isGift()) {
            giftWrap();
        }
        deliver();
    }

    protected abstract void selectItem();  // Step that must be implemented by subclasses

    protected abstract void makePayment(); // Step that must be implemented by subclasses

    // Default implementation (can be overridden by subclasses if needed)
    protected void giftWrap() {
        System.out.println("Gift wrap successful");
    }

    protected abstract void deliver(); // Step that must be implemented by subclasses

    // Hook method - can be overridden by subclasses to change the behavior
    protected boolean isGift() {
        return false;
    }
}