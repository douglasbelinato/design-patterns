package br.com.patterns.creational.factorymethod.approach01;

import br.com.patterns.creational.factorymethod.model.AirbusA380;
import br.com.patterns.creational.factorymethod.model.Airplane;

class AirbusA380FactoryMethod implements AirplaneFactoryMethod {

    @Override
    public Airplane create() {
        return new AirbusA380();
    }
}
