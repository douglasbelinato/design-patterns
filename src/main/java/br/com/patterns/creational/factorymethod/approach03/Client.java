package br.com.patterns.creational.factorymethod.approach03;

import br.com.patterns.creational.common.AirplaneModelEnum;

class Client {

    public static void main(String[] args) {
        var airplaneSimpleFactory = new AirplaneSimpleFactoryImpl();

        execute(airplaneSimpleFactory, AirplaneModelEnum.AIRBUS_A380);
        execute(airplaneSimpleFactory, AirplaneModelEnum.AIRBUS_A320);
        execute(airplaneSimpleFactory, AirplaneModelEnum.BOEING_747);
        execute(airplaneSimpleFactory, AirplaneModelEnum.BOEING_737);
    }


    private static void execute(AirplaneSimpleFactory airplaneSimpleFactory, AirplaneModelEnum airplaneModelEnum) {
        var line = "----------------------------------------------------";

        System.out.println(line);

        var airplane = airplaneSimpleFactory.create(airplaneModelEnum);
        airplane.doAutoHealthCheck();
        airplane.showCapacity();

        System.out.println(line);
    }

}
