package br.com.patterns.creational.abstractfactory.approach01;

import br.com.patterns.creational.abstractfactory.approach01.model.component.Boeing747Brake;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Boeing747Engine;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Boeing747Flap;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Brake;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Engine;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Flap;

public final class Boeing747ComponentsFactory implements AirplaneComponentsAbstractFactory {

    @Override
    public Brake createBreake() {
        return new Boeing747Brake();
    }

    @Override
    public Engine createEngine() {
        return new Boeing747Engine();
    }

    @Override
    public Flap createFlap() {
        return new Boeing747Flap();
    }
    
}
