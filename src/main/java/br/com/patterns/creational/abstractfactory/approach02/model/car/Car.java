package br.com.patterns.creational.abstractfactory.approach02.model.car;

import br.com.patterns.creational.abstractfactory.approach02.model.Vehicle;

public abstract class Car implements Vehicle {

    String carType;
    int baseCost;
    int chargesPerUnitDistance;

    @Override
    public void book(int distance){
        setVehicleType();
        setBaseCost();
        setVehicleChargesPerUnitDistance();
        var cost = calculateCostOfBooking(distance);
        System.out.println("You have booked a " + carType + " Car for a distance of " + distance + " kms at a total cost of " + cost + ". ");
    }

    @Override
    public int calculateCostOfBooking(int distance){
        var serviceCharge = 3;
        return baseCost + (chargesPerUnitDistance * distance) + serviceCharge;
    }

}
