package com.nal.structuralpattern.proxypattern.example2;

/**
 * Created by nishant on 16/11/18.
 */
public class Main {

    public static void main(String[] args)
    {
        IInternet internet = new ProxyInternet();
        try
        {
            internet.connectTo("automationindepth.com");
            internet.connectTo("blockedsite.com");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getStackTrace());
        }
    }
}
