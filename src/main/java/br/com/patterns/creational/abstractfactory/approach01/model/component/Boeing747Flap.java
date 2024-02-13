package br.com.patterns.creational.abstractfactory.approach01.model.component;

import java.util.UUID;

public class Boeing747Flap extends AbstractFlap {

    private final UUID id = UUID.randomUUID();

    @Override
    public UUID id() {
        return id;
    }

}
