package com.nal.creationalpattern.factoryobject;


/**
 * Created by Nishant on 09-11-2018.
 */
public class FordShowroom {

    private FordCarFactory fordCarFactory;

    public FordShowroom(FordCarFactory fordCarFactory) {
        this.fordCarFactory = fordCarFactory;
    }

    public FordCar purchaseCar(String carModel)
    {
        FordCar fordCar = fordCarFactory.createCar(carModel);

        fordCar.installAccessories();
        fordCar.installNumberPlate();
        fordCar.wash();
        fordCar.handoverTheKey();

        return fordCar;
    }
}
