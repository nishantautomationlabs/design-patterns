package com.nal.structuralpattern.decoratorpattern.example1;

/**
 * Created by nishant on 16/11/18.
 */
public class CarDecorator implements ICar {
    protected ICar car;

    public CarDecorator(ICar car) {
        this.car = car;
    }

    public void assemble() {
        car.assemble();
    }
}
