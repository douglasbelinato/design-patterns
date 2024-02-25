package br.com.patterns.creational.factorymethod.approach02;

import br.com.patterns.creational.common.AirplaneModelEnum;
import br.com.patterns.creational.factorymethod.model.AirbusA320;
import br.com.patterns.creational.factorymethod.model.AirbusA380;
import br.com.patterns.creational.factorymethod.model.Airplane;

class AirbusFactoryMethod implements AirplaneFactoryMethod {

    @Override
    public Airplane create(AirplaneModelEnum airplaneModelEnum) {
        if (airplaneModelEnum == AirplaneModelEnum.AIRBUS_A320) {
            return new AirbusA320();
        } else {
            return new AirbusA380();
        }
    }
}
