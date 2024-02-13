package br.com.patterns.creational.factorymethod.approach02;

import br.com.patterns.creational.common.AirplaneModelEnum;

class Client {

    public static void main(String[] args) {
        var airbusFactoryMethod = new AirbusFactoryMethod();
        var boeingFactoryMethod = new BoeingFactoryMethod();

        execute(airbusFactoryMethod, AirplaneModelEnum.AIRBUS_A380);
        execute(airbusFactoryMethod, AirplaneModelEnum.AIRBUS_A320);
        execute(boeingFactoryMethod, AirplaneModelEnum.BOEING_747);
        execute(boeingFactoryMethod, AirplaneModelEnum.BOEING_737);
    }


    private static void execute(AirplaneFactoryMethod airplaneFactoryMethod, AirplaneModelEnum airplaneModelEnum) {
        var line = "----------------------------------------------------";

        System.out.println(line);

        var airplane = airplaneFactoryMethod.create(airplaneModelEnum);
        airplane.doAutoHealthCheck();
        airplane.showCapacity();

        System.out.println(line);
    }

}
