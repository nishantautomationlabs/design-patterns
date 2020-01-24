package com.nal.behaviouralpattern.statepattern;

/**
 * Created by nishant on 23/01/20.
 */
public interface State {
    public void insertDollar(VendingMachine vendingMachine);

    public void ejectMoney(VendingMachine vendingMachine);

    public void dispense(VendingMachine vendingMachine);
}
