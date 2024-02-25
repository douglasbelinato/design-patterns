package br.com.patterns.creational.factorymethod.approach03;

import br.com.patterns.creational.common.AirplaneModelEnum;
import br.com.patterns.creational.factorymethod.model.AirbusA320;
import br.com.patterns.creational.factorymethod.model.AirbusA380;
import br.com.patterns.creational.factorymethod.model.Airplane;
import br.com.patterns.creational.factorymethod.model.Boeing737;
import br.com.patterns.creational.factorymethod.model.Boeing747;

class AirplaneSimpleFactoryImpl implements AirplaneSimpleFactory {

    @Override
    public Airplane create(AirplaneModelEnum airplaneModelEnum) {
        if (airplaneModelEnum == null) {
            throw new IllegalArgumentException("Invalid airplane model");
        }

        if (airplaneModelEnum == AirplaneModelEnum.AIRBUS_A320) {
            return new AirbusA320();
        } else if (airplaneModelEnum == AirplaneModelEnum.AIRBUS_A380) {
            return new AirbusA380();
        } else if (airplaneModelEnum == AirplaneModelEnum.BOEING_737) {
            return new Boeing737();
        } else {
            return new Boeing747();
        }
    }
}
