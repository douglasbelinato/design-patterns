package br.com.patterns.creational.factorymethod.approach01;

import br.com.patterns.creational.factorymethod.model.AirbusA320;
import br.com.patterns.creational.factorymethod.model.Airplane;

class AirbusA320FactoryMethod implements AirplaneFactoryMethod {

    @Override
    public Airplane create() {
        return new AirbusA320();
    }
}
