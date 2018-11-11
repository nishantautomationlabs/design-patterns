package com.nal.structuralpattern.facadepattern;

/**
 * Created by Nishant on 11-11-2018.
 */
public class Main {

    public static void main(String[] args)
    {
        AccountManager accountManager = new AccountManager();

        int mySavingAccount = accountManager.createAccount("Savings");
        int myLoanAccount = accountManager.createAccount("Loan");

        accountManager.depositMoney(mySavingAccount, 10000);
        accountManager.transferMoney(mySavingAccount, myLoanAccount, 5000);
    }
}
