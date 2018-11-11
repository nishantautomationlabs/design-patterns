package com.nal.structuralpattern.adapterpattern;

/**
 * Created by Nishant on 11-11-2018.
 */
public class WebClient {
    private IWebRequester webRequester;

    public WebClient(IWebRequester webRequester) {
        this.webRequester = webRequester;
    }

    private Object makeObject()
    {
        return new Object();
    }

    public void sendRequest()
    {
        Object object = makeObject();
        int response = webRequester.request(object);

        if(response == 200)
            System.out.println("Response code is 200");
        else
            System.out.println("Invalid response");
    }
}
