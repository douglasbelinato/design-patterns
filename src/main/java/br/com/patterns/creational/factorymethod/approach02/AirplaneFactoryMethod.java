package br.com.patterns.creational.factorymethod.approach02;

import br.com.patterns.creational.common.AirplaneModelEnum;
import br.com.patterns.creational.factorymethod.model.Airplane;

interface AirplaneFactoryMethod {

    Airplane create(AirplaneModelEnum airplaneModelEnum);

}
