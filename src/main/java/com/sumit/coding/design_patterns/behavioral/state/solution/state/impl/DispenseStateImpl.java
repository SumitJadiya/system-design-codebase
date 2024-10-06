package com.sumit.coding.design_patterns.behavioral.state.solution.state.impl;

import com.sumit.coding.design_patterns.behavioral.state.solution.model.Coin;
import com.sumit.coding.design_patterns.behavioral.state.solution.model.Item;
import com.sumit.coding.design_patterns.behavioral.state.solution.model.VendingMachine;
import com.sumit.coding.design_patterns.behavioral.state.solution.state.VendingState;
import lombok.SneakyThrows;

import java.util.List;

public class DispenseStateImpl implements VendingState {

    public DispenseStateImpl() {
        System.out.println("Currently, the vending machine is in Dispense state!!");
    }

    public DispenseStateImpl(VendingMachine machine, int codeNumber) throws Exception{

        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }


    @Override
    @SneakyThrows
    public void clickOnInsertCoinButton(VendingMachine machine) {
        throw new Exception("insert coin button can not clicked on Dispense state");
    }

    @Override
    @SneakyThrows
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) {
        throw new Exception("Please click on insert coin to proceed further!");
    }

    @Override
    @SneakyThrows
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        throw new Exception("coin can not be inserted in Dispense state!");
    }

    @Override
    @SneakyThrows
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) {
        throw new Exception("product can not be chosen in Dispense state!");
    }

    @Override
    @SneakyThrows
    public int getChange(int returnChangeAmount) {
        throw new Exception("change can not returned in Dispense state!");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) {
        Item item = vendingMachine.getInventory().getItem(codeNumber);
        vendingMachine.getInventory().updateSoldOutItem(codeNumber);
        vendingMachine.setVendingMachineState(new IdleStateImpl(vendingMachine));

        System.out.println("Dispensing the product" + item.getType());

        return item;
    }

    @Override
    @SneakyThrows
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        throw new Exception("refund can not be happen in Dispense state!");
    }
}
