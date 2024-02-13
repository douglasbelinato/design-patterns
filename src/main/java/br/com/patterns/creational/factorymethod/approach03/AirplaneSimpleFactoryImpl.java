package br.com.patterns.creational.factorymethod.approach03;

import br.com.patterns.creational.common.AirplaneModelEnum;
import br.com.patterns.creational.factorymethod.model.*;
import lombok.NonNull;

class AirplaneSimpleFactoryImpl implements AirplaneSimpleFactory {

    @Override
    public Airplane create(@NonNull AirplaneModelEnum airplaneModelEnum) {
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
