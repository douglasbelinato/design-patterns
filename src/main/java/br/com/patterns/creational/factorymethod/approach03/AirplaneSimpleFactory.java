package br.com.patterns.creational.factorymethod.approach03;

import br.com.patterns.creational.common.AirplaneModelEnum;
import br.com.patterns.creational.factorymethod.model.Airplane;

interface AirplaneSimpleFactory {

    Airplane create(AirplaneModelEnum airplaneModelEnum);

}
