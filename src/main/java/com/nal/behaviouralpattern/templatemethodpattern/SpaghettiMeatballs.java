package com.nal.behaviouralpattern.templatemethodpattern;

/**
 * Created by nishant on 23/01/20.
 */
public class SpaghettiMeatballs extends PastaDish {
    @Override
    protected void addPasta() {
        System.out.println("Add spaghetti");
    }

    @Override
    protected void addProtein() {
        System.out.println("Add meatballs");
    }

    @Override
    protected void addSauce() {
        System.out.println("Add tomato sauce");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Add Parmesan Cheese");
    }
}
