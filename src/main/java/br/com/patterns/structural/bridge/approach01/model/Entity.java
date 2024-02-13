package br.com.patterns.structural.bridge.approach01.model;

import java.util.UUID;

public abstract class Entity {

    protected String id;


    public void setId(String id) {
        this.id = id;
    }
}
