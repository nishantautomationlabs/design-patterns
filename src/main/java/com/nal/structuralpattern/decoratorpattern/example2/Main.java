package com.nal.structuralpattern.decoratorpattern.example2;

/**
 * Created by nishant on 17/11/18.
 */
public class Main {

    public static void main(String[] args)
    {
        IWebPage webPage = new NavBarPage(new FooterPage(new HeaderPage(new BasicWebPage())));
        webPage.display();
    }
}
