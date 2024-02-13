package br.com.patterns.creational.factorymethod.model;

import br.com.patterns.creational.common.AirplaneModelEnum;

public class Boeing747 extends Airplane {

    public Boeing747() {
        super(AirplaneModelEnum.BOEING_747, 452);
    }


    @Override
    public void doSpecificAutoHealthCheck() {
        System.out.println("Checking system D");
    }

}
