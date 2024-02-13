package br.com.patterns.creational.abstractfactory.approach02.model.auto;

public class PersonalAuto extends Auto {

    public PersonalAuto() {
    }

    @Override
    public void setVehicleType() {
        shareType = "Personal";
    }

    @Override
    public void setBaseCost() {
        baseCost = 10;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 15;
    }
}
