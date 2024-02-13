package br.com.patterns.creational.abstractfactory.approach01.model.component;

public abstract class AbstractEngine implements Engine {

    @Override
    public void start() {
        System.out.println("[Component id " + id() + "] Starting engine");
    }

}
