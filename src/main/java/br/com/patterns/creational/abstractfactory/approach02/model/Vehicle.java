package br.com.patterns.creational.abstractfactory.approach02.model;

public interface Vehicle {

    void book(int distance);
    void setVehicleType();
    void setBaseCost();
    void setVehicleChargesPerUnitDistance();
    int calculateCostOfBooking(int distance);

}
