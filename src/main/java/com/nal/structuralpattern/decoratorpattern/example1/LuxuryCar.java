package com.nal.structuralpattern.decoratorpattern.example1;

/**
 * Created by nishant on 16/11/18.
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(ICar car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Add luxury car feature to it");
    }
}
