package br.com.patterns.creational.abstractfactory.approach01.model.component;

import java.util.UUID;

public class A380Engine extends AbstractEngine {

    private final UUID id = UUID.randomUUID();

    @Override
    public UUID id() {
        return id;
    }

}
