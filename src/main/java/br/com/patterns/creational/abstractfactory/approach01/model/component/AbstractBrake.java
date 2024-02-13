package br.com.patterns.creational.abstractfactory.approach01.model.component;

public abstract class AbstractBrake implements Brake {

    @Override
    public void brake() {
        System.out.println("[Component id " + id() + "] Braking");
    }

}
