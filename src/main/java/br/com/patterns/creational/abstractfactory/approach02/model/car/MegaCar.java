package br.com.patterns.creational.abstractfactory.approach02.model.car;

public class MegaCar extends Car {

    @Override
    public void setVehicleType(){
        carType = "Mega";
    }

    @Override
    public void setBaseCost(){
        baseCost = 150;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 30;
    }

}
