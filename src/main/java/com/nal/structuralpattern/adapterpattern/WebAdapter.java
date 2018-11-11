package com.nal.structuralpattern.adapterpattern;

/**
 * Created by Nishant on 11-11-2018.
 */
public class WebAdapter implements IWebRequester{

    private WebService webService;

    public WebAdapter(WebService webService) {
        this.webService = webService;
    }

    @Override
    public int request(Object object) {
        Json jsonRequest = toJson(object);
        Json response = webService.request(jsonRequest);
        if(response != null)
            return 200;
        return 500;
    }

    private Json toJson(Object object) {
        return new Json();
    }
}
