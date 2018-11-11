package com.nal.creationalpattern.factoryobject;

/**
 * Created by Nishant on 09-11-2018.
 */
public class FordCarFactory {

    public FordCar createCar(String carModel)
    {
        FordCar fordCar = null;

        //create Car based on the model -- Concrete initialization
        if(carModel.equalsIgnoreCase("FordEcosport"))
            fordCar = new FordEcosport();
        else if(carModel.equalsIgnoreCase("FordFigo"))
            fordCar = new FordEndeavour();

        return fordCar;
    }
}
