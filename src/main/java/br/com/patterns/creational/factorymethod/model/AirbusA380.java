package br.com.patterns.creational.factorymethod.model;

import br.com.patterns.creational.common.AirplaneModelEnum;

public class AirbusA380 extends Airplane {

    public AirbusA380() {
        super(AirplaneModelEnum.AIRBUS_A380, 525);
    }

    @Override
    public void doSpecificAutoHealthCheck() {
        System.out.println("Checking system X");
        System.out.println("Checking system Y");
    }

}
