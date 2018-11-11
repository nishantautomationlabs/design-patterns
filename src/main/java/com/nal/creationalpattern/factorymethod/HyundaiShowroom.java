package com.nal.creationalpattern.factorymethod;

/**
 * Created by Nishant on 09-11-2018.
 */
public class HyundaiShowroom extends Showroom {

    @Override
    Car createCar(String carType) {
        Car car = null;

        //create Car based on the model -- Concrete initialization
        if(carType.equalsIgnoreCase("SUV"))
            car = new HyundaiCreata();
        else if(carType.equalsIgnoreCase("hatchback"))
            car = new HyundaiI20();

        return car;

    }
}
