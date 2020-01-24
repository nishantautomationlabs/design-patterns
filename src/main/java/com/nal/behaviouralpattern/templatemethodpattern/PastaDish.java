package com.nal.behaviouralpattern.templatemethodpattern;

/**
 * Created by nishant on 23/01/20.
 */
public abstract class PastaDish {

    public final void makeRecipe()
    {
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }

    protected abstract void addPasta();

    protected abstract void addProtein();

    protected abstract void addSauce();

    protected abstract void addGarnish();

    private void drainAndPlate()
    {
        System.out.println("Drain and Plate");
    }

    private void cookPasta(){
        System.out.println("Cooking");
    }

    private void boilWater(){
        System.out.println("Boiling Water");
    }
}
