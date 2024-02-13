package br.com.patterns.creational.factorymethod.model;

import br.com.patterns.creational.common.AirplaneModelEnum;

public class AirbusA320 extends Airplane {

    public AirbusA320() {
        super(AirplaneModelEnum.AIRBUS_A320, 190);
    }

    @Override
    public void doSpecificAutoHealthCheck() {
        System.out.println("Checking system A");
        System.out.println("Checking system B");
        System.out.println("Checking system C");
    }

}
