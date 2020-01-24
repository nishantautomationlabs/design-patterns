package com.nal.behaviouralpattern.statepattern;

/**
 * Created by nishant on 23/01/20.
 */
public class VendingMachine implements State {

    public State idleState;
    public State hasOneDollarState;
    public State outOfStockState;

    public State currentState;
    private int count;

    public VendingMachine(int count) {
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();

        this.count = count;
        if (count > 0) {
            currentState = idleState;
        } else {
            currentState = outOfStockState;
        }
    }

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        currentState.insertDollar(this);
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        currentState.ejectMoney(this);
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        currentState.dispense(this);
    }


    public State getHasOneDollarState() {
        return hasOneDollarState;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }

    public void setState(State state) {
        currentState = state;
    }

    public int getCount() {
        return count;
    }

    public void doReturnMoney() {
        System.out.println("Returning Money");
    }

    public void doReleaseProduct() {
        System.out.println("Release Product");
    }



}
