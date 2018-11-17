package com.nal.structuralpattern.decoratorpattern.example2;

/**
 * Created by nishant on 17/11/18.
 */
public class WebPageDecorator implements IWebPage {

    protected IWebPage webPage;

    public WebPageDecorator(IWebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public void display() {
        this.webPage.display();
    }
}
