package br.com.patterns.creational.abstractfactory.approach02.model.car;

public class MiniCar extends Car {

    @Override
    public void setVehicleType() {
        carType = "Mini";
    }

    @Override
    public void setBaseCost() {
        baseCost = 100;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 20;
    }
}
