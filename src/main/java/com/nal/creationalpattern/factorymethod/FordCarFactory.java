package com.nal.creationalpattern.factorymethod;

/**
 * Created by Nishant on 09-11-2018.
 */
public class FordCarFactory {

    public Car createCar(String carModel)
    {
        Car fordCar = null;

        //create Car based on the model -- Concrete initialization
        if(carModel.equalsIgnoreCase("Ecosport"))
            fordCar = new FordEcosport();
        else if(carModel.equalsIgnoreCase("Endeavour"))
            fordCar = new FordFigo();

        return fordCar;
    }
}
