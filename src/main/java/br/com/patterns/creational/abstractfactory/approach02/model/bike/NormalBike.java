package br.com.patterns.creational.abstractfactory.approach02.model.bike;

public class NormalBike extends Bike {


    @Override
    public void setVehicleType() {
        bikeType = "Normal";
    }

    @Override
    public void setBaseCost() {
        baseCost = 20;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 5;
    }
}
