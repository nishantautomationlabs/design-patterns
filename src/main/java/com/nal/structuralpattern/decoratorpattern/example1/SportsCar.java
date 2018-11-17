package com.nal.structuralpattern.decoratorpattern.example1;

/**
 * Created by nishant on 16/11/18.
 */
public class SportsCar extends CarDecorator {

    public SportsCar(ICar car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Add sport car feature to it");
    }
}
