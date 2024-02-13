package br.com.patterns.creational.abstractfactory.approach01.model.component;

public abstract class AbstractFlap implements Flap {

    @Override
    public void configure() {
        System.out.println("[Component id " + id() + "] Configuring flap");
    }

}
