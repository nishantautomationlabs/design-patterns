package com.nal.structuralpattern.decoratorpattern.example2;

/**
 * Created by nishant on 17/11/18.
 */
public class FooterPage extends WebPageDecorator {

    public FooterPage(IWebPage webPage) {
        super(webPage);
    }

    public void display() {
        super.display();
        System.out.println("Add footer to the page");
    }
}
