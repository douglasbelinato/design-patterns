package br.com.patterns.creational.factorymethod.approach01;

import br.com.patterns.creational.factorymethod.model.Airplane;
import br.com.patterns.creational.factorymethod.model.Boeing747;

class Boeing747FactoryMethod implements AirplaneFactoryMethod {

    @Override
    public Airplane create() {
        return new Boeing747();
    }
}
