package com.nal.structuralpattern.proxypattern.example2;

import com.nal.structuralpattern.proxypattern.example2.IInternet;
import com.nal.structuralpattern.proxypattern.example2.RealInternet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nishant on 16/11/18.
 */
public class ProxyInternet implements IInternet {

    private IInternet internet = new RealInternet();
    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("blockedsite.com");
        bannedSites.add("someharmfulsite.com");
        bannedSites.add("xyz.com");
    }

    public void connectTo(String host) throws Exception {
        if(bannedSites.contains(host))
        {
            throw new Exception("Access to Host is not allowed");
        }
        else
            internet.connectTo(host);
    }
}
