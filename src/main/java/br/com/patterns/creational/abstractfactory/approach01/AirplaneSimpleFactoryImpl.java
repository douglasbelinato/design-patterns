package br.com.patterns.creational.abstractfactory.approach01;

import br.com.patterns.creational.abstractfactory.approach01.model.airplane.AirbusA380;
import br.com.patterns.creational.abstractfactory.approach01.model.airplane.Airplane;
import br.com.patterns.creational.abstractfactory.approach01.model.airplane.Boeing747;
import br.com.patterns.creational.common.AirplaneModelEnum;
import lombok.NonNull;

class AirplaneSimpleFactoryImpl implements AirplaneSimpleFactory {

    @Override
    public Airplane create(@NonNull AirplaneModelEnum airplaneModelEnum) {
        if (AirplaneModelEnum.AIRBUS_A380 == airplaneModelEnum) {
            return new AirbusA380(new AirbusA380ComponentsFactory());
        } else if (AirplaneModelEnum.BOEING_747 == airplaneModelEnum) {
            return new Boeing747(new Boeing747ComponentsFactory());
        } else {
            throw new RuntimeException("Factory not found fot the airplane model provided");
        }
    }
}
