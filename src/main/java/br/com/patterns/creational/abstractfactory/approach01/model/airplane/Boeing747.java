package br.com.patterns.creational.abstractfactory.approach01.model.airplane;

import br.com.patterns.creational.abstractfactory.approach01.AirplaneComponentsAbstractFactory;
import br.com.patterns.creational.common.AirplaneModelEnum;

public class Boeing747 extends Airplane {

    public Boeing747(AirplaneComponentsAbstractFactory airplaneComponentsAbstractFactory) {
        super(airplaneComponentsAbstractFactory);
    }

    @Override
    protected AirplaneModelEnum getAirplaneModelEnum() {
        return AirplaneModelEnum.BOEING_747;
    }

}
