package br.com.patterns.creational.factorymethod.model;

import br.com.patterns.creational.common.AirplaneModelEnum;

public class Boeing737 extends Airplane {

    public Boeing737() {
        super(AirplaneModelEnum.BOEING_737, 180);
    }


    @Override
    public void doSpecificAutoHealthCheck() {
        System.out.println("Checking system G");
    }

}
