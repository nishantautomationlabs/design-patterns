package com.nal.structuralpattern.decoratorpattern.example2;

/**
 * Created by nishant on 17/11/18.
 */
public class BasicWebPage implements IWebPage {

    @Override
    public void display() {
        System.out.println("Render Basic Web Page");
    }
}
