package com.nal.structuralpattern.decoratorpattern;

/**
 * Created by nishant on 17/11/18.
 */
public class Main {

    public static void main(String[] args)
    {
        ICar sportsCar = new SportsCar(new Car());
        sportsCar.assemble();

        ICar luxurySportsCar = new LuxuryCar(new SportsCar(new Car()));
        luxurySportsCar.assemble();
    }
}
