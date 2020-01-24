package com.nal.behaviouralpattern.statepattern;

/**
 * Created by nishant on 23/01/20.
 */
public class HasOneDollarState implements State {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Already have one dollar");
        vendingMachine.doReturnMoney();
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("returning money");
        vendingMachine.doReturnMoney();
        if(vendingMachine.getCount() == 0)
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        else
            vendingMachine.setState(vendingMachine.getIdleState());
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("releasing product");
        vendingMachine.doReleaseProduct();
        if(vendingMachine.getCount() == 0)
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        else
            vendingMachine.setState(vendingMachine.getIdleState());
    }
}
