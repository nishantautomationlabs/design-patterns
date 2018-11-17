package com.nal.structuralpattern.decoratorpattern.example2;

/**
 * Created by nishant on 17/11/18.
 */
public class NavBarPage extends WebPageDecorator {

    public NavBarPage(IWebPage webPage) {
        super(webPage);
    }

    public void display() {
        super.display();
        System.out.println("Add navigation bar to the page");
    }
}
