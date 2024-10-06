package com.sumit.coding.design_patterns.behavioral.state.solution.model;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
public class Inventory {

    ItemShelf[] inventory;

    public Inventory(int itemCount) {
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    private void initialEmptyInventory() {
        int startCode = 101;
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i] = space;
            startCode++;
        }
    }

    @SneakyThrows
    public Item getItem(int codeNumber) {

        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.code == codeNumber) {
                if (itemShelf.isSoldOut())
                    throw new Exception("item already sold out");
                else
                    return itemShelf.item;
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber) {
        for (ItemShelf itemShelf : inventory)
            if (itemShelf.code == codeNumber)
                itemShelf.setSoldOut(true);
    }
}
