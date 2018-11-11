package com.nal.creationalpattern.factorymethod;

/**
 * Created by Nishant on 09-11-2018.
 */
public class FordShowroom extends Showroom {

    @Override
    Car createCar(String carType) {
        Car car = null;

        //create Car based on the model -- Concrete initialization
        if(carType.equalsIgnoreCase("SUV"))
            car = new FordEcosport();
        else if(carType.equalsIgnoreCase("hatchback"))
            car = new FordFigo();

        return car;

    }
}
