package com.sumit.coding.design_patterns.behavioral.state.solution.state.impl;

import com.sumit.coding.design_patterns.behavioral.state.solution.model.Coin;
import com.sumit.coding.design_patterns.behavioral.state.solution.model.Item;
import com.sumit.coding.design_patterns.behavioral.state.solution.model.VendingMachine;
import com.sumit.coding.design_patterns.behavioral.state.solution.state.VendingState;
import lombok.SneakyThrows;

import java.util.List;

public class ProductSelectionStateImpl implements VendingState {

    public ProductSelectionStateImpl() {
        System.out.println("Currently, the vending machine is in Product Selection state!!");
    }

    @Override
    @SneakyThrows
    public void clickOnInsertCoinButton(VendingMachine machine) {
        throw new Exception("You can't insert coins in Product Selection State, pls use correct operation to proceed further!");
    }

    @Override
    @SneakyThrows
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) {
        throw new Exception("You are already Product Selection State, pls use correct operation to proceed further!");
    }

    @Override
    @SneakyThrows
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        throw new Exception("You can't insert money in Product Selection State, pls use correct operation to proceed further!");
    }

    @Override
    @SneakyThrows
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) {
        Item item = vendingMachine.getInventory().getItem(codeNumber);
        System.out.println("choosing product: " + item.getType());

        int paidByUser = 0;

        for (Coin coin : vendingMachine.getCoinList()) {
            paidByUser += coin.value;
        }

        if (paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you select is worth: " + item.getPrice() + " and you've paid: " + paidByUser);
            refundFullMoney(vendingMachine);
            throw new Exception("Insufficient fund!");
        } else if (paidByUser > item.getPrice()) {
            getChange(paidByUser - item.getPrice());
        }

        vendingMachine.setVendingMachineState(new DispenseStateImpl(vendingMachine, codeNumber));
    }

    @Override
    public int getChange(int returnChangeAmount) {
        System.out.println("Returning the extra amount: " + returnChangeAmount);
        return returnChangeAmount;
    }

    @Override
    @SneakyThrows
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) {
        throw new Exception("You can't dispense money in Product Selection State, pls use correct operation to proceed further!");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        System.out.println("Returning the full amount");
        vendingMachine.setVendingMachineState(new IdleStateImpl());
        return vendingMachine.getCoinList();
    }
}

