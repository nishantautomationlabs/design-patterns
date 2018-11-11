package com.nal.structuralpattern.facadepattern;


/**
 * Created by Nishant on 11-11-2018.
 */
public interface IAccount {

    void deposit(int amount);
    void withdraw(int amount);
    int getAccountNumber();
}
