package br.com.patterns.creational.abstractfactory.approach02;

import br.com.patterns.creational.abstractfactory.approach02.model.FactoryTypeEnum;
import lombok.NonNull;

public final class BookFactoryProvider {

    private BookFactoryProvider() {
    }

    public static AbstractVehicleFactory getVehicleFactory(@NonNull FactoryTypeEnum factoryTypeEnum) {
        if (factoryTypeEnum == FactoryTypeEnum.CAR) {
            return new CarFactory();
        } else if (factoryTypeEnum == FactoryTypeEnum.AUTO) {
            return new AutoFactory();
        } else {
            return new BikeFactory();
        }
    }
}
