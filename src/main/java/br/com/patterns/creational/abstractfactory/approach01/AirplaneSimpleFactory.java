package br.com.patterns.creational.abstractfactory.approach01;

import br.com.patterns.creational.abstractfactory.approach01.model.airplane.Airplane;
import br.com.patterns.creational.common.AirplaneModelEnum;
import lombok.NonNull;

interface AirplaneSimpleFactory {

    Airplane create(@NonNull AirplaneModelEnum airplaneModelEnum);

}
