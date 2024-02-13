package br.com.patterns.creational.abstractfactory.approach01;

import br.com.patterns.creational.common.AirplaneModelEnum;

public class Client {

    public static void main(String[] args) {
        execute(AirplaneModelEnum.AIRBUS_A380);
        execute(AirplaneModelEnum.BOEING_747);
    }

    private static void execute(AirplaneModelEnum airplaneModelEnum) {
        var airplane = new AirplaneSimpleFactoryImpl().create(airplaneModelEnum);
        airplane.testComponents();
    }
}
