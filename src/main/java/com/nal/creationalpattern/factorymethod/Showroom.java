package com.nal.creationalpattern.factorymethod;


/**
 * Created by Nishant on 09-11-2018.
 */
public abstract class Showroom {

    public Car purchaseCar(String carType)
    {
        Car car = createCar(carType);

        car.installAccessories();
        car.installNumberPlate();
        car.wash();
        car.handoverTheKey();

        return car;
    }

    abstract Car createCar(String carType);

}
