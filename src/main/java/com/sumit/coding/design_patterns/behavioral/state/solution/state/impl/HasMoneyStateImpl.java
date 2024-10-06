package com.sumit.coding.design_patterns.behavioral.state.solution.state.impl;

import com.sumit.coding.design_patterns.behavioral.state.solution.model.Coin;
import com.sumit.coding.design_patterns.behavioral.state.solution.model.Item;
import com.sumit.coding.design_patterns.behavioral.state.solution.model.VendingMachine;
import com.sumit.coding.design_patterns.behavioral.state.solution.state.VendingState;
import lombok.SneakyThrows;

import java.util.List;

public class HasMoneyStateImpl implements VendingState {

    public HasMoneyStateImpl() {
        System.out.println("Currently, the vending machine is in HasMoney state!!");
    }

    @Override
    @SneakyThrows
    public void clickOnInsertCoinButton(VendingMachine machine) {
        throw new Exception("Invalid Operation! Please click on select product button to proceed further!");
    }

    @Override
    @SneakyThrows
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new ProductSelectionStateImpl());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Accepted coins");
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    @SneakyThrows
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) {
        throw new Exception("Invalid Operation! Please click on select product button to proceed further!");
    }

    @Override
    @SneakyThrows
    public int getChange(int returnChangeAmount) {
        throw new Exception("Invalid Operation! Please click on select product button to proceed further!");
    }

    @Override
    @SneakyThrows
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) {
        throw new Exception("Invalid Operation! Please click on select product button to proceed further!");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        System.out.println("Refunded the full amount back in coin dispenser tray");
        vendingMachine.setVendingMachineState(new IdleStateImpl());
        return vendingMachine.getCoinList();
    }
}

