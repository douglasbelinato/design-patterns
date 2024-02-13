package br.com.patterns.creational.abstractfactory.approach02.model.car;

public class MicroCar extends Car {

    @Override
    public void setVehicleType() {
        carType = "Micro";
    }

    @Override
    public void setBaseCost() {
        baseCost = 50;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 10;
    }
}
