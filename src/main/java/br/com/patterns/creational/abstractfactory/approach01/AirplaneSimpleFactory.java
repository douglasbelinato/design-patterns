package br.com.patterns.creational.abstractfactory.approach01;

import br.com.patterns.creational.abstractfactory.approach01.model.airplane.Airplane;
import br.com.patterns.creational.common.AirplaneModelEnum;

interface AirplaneSimpleFactory {

    Airplane create(AirplaneModelEnum airplaneModelEnum);

}
