package br.com.patterns.creational.abstractfactory.approach01;

import br.com.patterns.creational.abstractfactory.approach01.model.component.Brake;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Engine;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Flap;

public interface AirplaneComponentsAbstractFactory {

    Brake createBreake();

    Engine createEngine();

    Flap createFlap();

}
