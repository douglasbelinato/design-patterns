package br.com.patterns.creational.abstractfactory.approach02.model.bike;

public class SportsBike extends Bike {

    @Override
    public void setVehicleType() {
        bikeType = "Sports";
    }

    @Override
    public void setBaseCost() {
        baseCost = 40;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 15;
    }
}
