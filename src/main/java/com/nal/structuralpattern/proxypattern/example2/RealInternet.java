package com.nal.structuralpattern.proxypattern.example2;

/**
 * Created by nishant on 16/11/18.
 */
public class RealInternet implements IInternet {

    public void connectTo(String host) {
        System.out.printf("connecting to host " + host);
    }
}
