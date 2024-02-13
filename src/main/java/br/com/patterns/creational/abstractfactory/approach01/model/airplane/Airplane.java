package br.com.patterns.creational.abstractfactory.approach01.model.airplane;

import br.com.patterns.creational.abstractfactory.approach01.AirplaneComponentsAbstractFactory;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Brake;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Engine;
import br.com.patterns.creational.abstractfactory.approach01.model.component.Flap;
import br.com.patterns.creational.common.AirplaneModelEnum;

public abstract class Airplane {

    private final Brake brake;
    private final Engine engine;
    private final Flap flap;

    protected Airplane(AirplaneComponentsAbstractFactory airplaneComponentsAbstractFactory) {
        this.brake = airplaneComponentsAbstractFactory.createBreake();
        this.engine = airplaneComponentsAbstractFactory.createEngine();
        this.flap = airplaneComponentsAbstractFactory.createFlap();
    }

    public void testComponents() {
        System.out.println("================================================================");
        System.out.println("=> Testing components for model " + getAirplaneModelEnum());
        brake.brake();
        engine.start();
        flap.configure();
        System.out.println("================================================================");
    }

    protected abstract AirplaneModelEnum getAirplaneModelEnum();

}
