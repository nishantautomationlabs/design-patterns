package com.nal.structuralpattern.decoratorpattern.example2;

/**
 * Created by nishant on 17/11/18.
 */
public class HeaderPage extends WebPageDecorator {

    public HeaderPage(IWebPage webPage) {
        super(webPage);
    }

    public void display() {
        super.display();
        System.out.println("Add header to the page");
    }
}
