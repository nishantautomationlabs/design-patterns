package com.nal.behaviouralpattern.statepattern;

/**
 * Created by nishant on 23/01/20.
 */
public class OutOfStockState implements State {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Dollar inserted");
        vendingMachine.setState(vendingMachine.getHasOneDollarState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("no money to eject");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Out of Stock");
    }
}
