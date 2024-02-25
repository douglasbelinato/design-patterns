package br.com.patterns.creational.abstractfactory.approach01;

import br.com.patterns.creational.abstractfactory.approach01.model.component.A380Brake;
import br.com.patterns.creational.abstractfactory.approach01.model.component.A380Engine;
import br.com.patterns.creational.abstractfactory.approach01.model.component.A380Flap;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Brake;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Engine;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Flap;

public final class AirbusA380ComponentsFactory implements AirplaneComponentsAbstractFactory {

    @Override
    public Brake createBreake() {
        return new A380Brake();
    }

    @Override
    public Engine createEngine() {
        return new A380Engine();
    }

    @Override
    public Flap createFlap() {
        return new A380Flap();
    }

}
