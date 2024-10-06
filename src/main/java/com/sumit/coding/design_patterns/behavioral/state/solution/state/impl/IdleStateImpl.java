package com.sumit.coding.design_patterns.behavioral.state.solution.state.impl;

import com.sumit.coding.design_patterns.behavioral.state.solution.model.Coin;
import com.sumit.coding.design_patterns.behavioral.state.solution.model.Item;
import com.sumit.coding.design_patterns.behavioral.state.solution.model.VendingMachine;
import com.sumit.coding.design_patterns.behavioral.state.solution.state.VendingState;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class IdleStateImpl implements VendingState {

    public IdleStateImpl() {
        System.out.println("Currently, the vending machine is in Idle state!!");
    }

    public IdleStateImpl(VendingMachine machine) {
        System.out.println("Currently, the vending machine is in Idle state!!");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        System.out.println("Successfully pressed the Insert Coin button!!");
        machine.setVendingMachineState(new HasMoneyStateImpl());
    }

    @Override
    @SneakyThrows
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) {
        throw new Exception("Please click on insert coin to proceed further!");
    }

    @Override
    @SneakyThrows
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        throw new Exception("Please click on insert coin to proceed further!");
    }

    @Override
    @SneakyThrows
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) {
        throw new Exception("Please click on insert coin to proceed further!");
    }

    @Override
    @SneakyThrows
    public int getChange(int returnChangeAmount) {
        throw new Exception("Please click on insert coin to proceed further!");
    }

    @Override
    @SneakyThrows
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) {
        throw new Exception("Please click on insert coin to proceed further!");
    }

    @Override
    @SneakyThrows
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        throw new Exception("Please click on insert coin to proceed further!");
    }
}
