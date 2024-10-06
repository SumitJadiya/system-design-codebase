package com.sumit.coding.design_patterns.behavioral.state.solution.state;

import com.sumit.coding.design_patterns.behavioral.state.solution.model.Coin;
import com.sumit.coding.design_patterns.behavioral.state.solution.model.Item;
import com.sumit.coding.design_patterns.behavioral.state.solution.model.VendingMachine;

import java.util.List;

public interface VendingState {

    void clickOnInsertCoinButton(VendingMachine vendingMachine);

    void clickOnStartProductSelectionButton(VendingMachine vendingMachine);

    void insertCoin(VendingMachine vendingMachine, Coin coin);

    void chooseProduct(VendingMachine vendingMachine, int codeNumber);

    int getChange(int returnChangeAmount);

    Item dispenseProduct(VendingMachine vendingMachine, int codeNumber);

    List<Coin> refundFullMoney(VendingMachine vendingMachine);
}
