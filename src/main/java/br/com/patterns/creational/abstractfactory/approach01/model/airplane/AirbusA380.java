package br.com.patterns.creational.abstractfactory.approach01.model.airplane;

import br.com.patterns.creational.abstractfactory.approach01.AirplaneComponentsAbstractFactory;
import br.com.patterns.creational.common.AirplaneModelEnum;

public class AirbusA380 extends Airplane {

    public AirbusA380(AirplaneComponentsAbstractFactory airplaneComponentsAbstractFactory) {
        super(airplaneComponentsAbstractFactory);
    }

    @Override
    protected AirplaneModelEnum getAirplaneModelEnum() {
        return AirplaneModelEnum.AIRBUS_A380;
    }

}
