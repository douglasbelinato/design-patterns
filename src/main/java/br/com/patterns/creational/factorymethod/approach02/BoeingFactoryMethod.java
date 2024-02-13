package br.com.patterns.creational.factorymethod.approach02;

import br.com.patterns.creational.common.AirplaneModelEnum;
import br.com.patterns.creational.factorymethod.model.Airplane;
import br.com.patterns.creational.factorymethod.model.Boeing737;
import br.com.patterns.creational.factorymethod.model.Boeing747;
import lombok.NonNull;

public class BoeingFactoryMethod implements AirplaneFactoryMethod {

    @Override
    public Airplane create(@NonNull AirplaneModelEnum airplaneModelEnum) {
        if (airplaneModelEnum == AirplaneModelEnum.BOEING_737) {
            return new Boeing737();
        } else {
            return new Boeing747();
        }
    }
}
