package com.nal.structuralpattern.facadepattern;

import java.util.HashMap;

/**
 * Created by Nishant on 11-11-2018.
 */
public class AccountManager {

    public HashMap<Integer, IAccount> accountHashMap;

    public AccountManager() {
        this.accountHashMap = new HashMap<Integer, IAccount>();
    }

    public int createAccount(String accountType)
    {
        IAccount account = null;

        switch (accountType.toUpperCase())
        {
            case "SAVINGS": {
                account = new SavingsAccount();
                break;
            }
            case "CURRENT": {
                account = new CurrentAccount();
                break;
            }
            case "LOAN": {
                account = new LoanAccount();
                break;
            }
            default:
                System.out.println("Incorrect account type " + accountType);
                System.exit(0);
        }

        accountHashMap.put(account.getAccountNumber(), account);
        return account.getAccountNumber();
    }

    public void depositMoney(int accountNumber, int amount)
    {
        IAccount account = accountHashMap.get(accountNumber);
        account.deposit(amount);
    }

    public void withdrawMoney(int accountNumber, int amount)
    {
        IAccount account = accountHashMap.get(accountNumber);
        account.withdraw(amount);
    }

    public void transferMoney(int fromAccountNumber, int toAccountNumber, int amount)
    {
        IAccount fromAccount = accountHashMap.get(fromAccountNumber);
        IAccount toAccount = accountHashMap.get(toAccountNumber);
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
