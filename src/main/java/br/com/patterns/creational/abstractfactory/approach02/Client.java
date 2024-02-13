package br.com.patterns.creational.abstractfactory.approach02;

import br.com.patterns.creational.abstractfactory.approach02.model.FactoryTypeEnum;

public class Client {

    public static void main(String[] args) {
        int distance = 10;

        var carFactory = BookFactoryProvider.getVehicleFactory(FactoryTypeEnum.CAR);
        var miniCar = carFactory.getVehicle("Mini");
        var carContract = carFactory.getContract();
        miniCar.book(distance);
        carContract.showDetails();

        System.out.println("-------------------------------------");

        var autoFactory = BookFactoryProvider.getVehicleFactory(FactoryTypeEnum.AUTO);
        var autoContract = autoFactory.getContract();
        var personalAuto = autoFactory.getVehicle("Personal");
        personalAuto.book(distance);
        autoContract.showDetails();

        System.out.println("-------------------------------------");

        var bikeFactory = BookFactoryProvider.getVehicleFactory(FactoryTypeEnum.BIKE);
        var sportsBikeContract = bikeFactory.getContract();
        var sportsBike = bikeFactory.getVehicle("Sports");
        sportsBike.book(distance);
        sportsBikeContract.showDetails();

    }

}
