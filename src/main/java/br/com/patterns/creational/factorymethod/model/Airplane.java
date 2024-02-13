package br.com.patterns.creational.factorymethod.model;

import br.com.patterns.creational.common.AirplaneModelEnum;
import lombok.NonNull;

public abstract class Airplane {

    protected AirplaneModelEnum model;
    protected int capacity;

    protected Airplane(@NonNull AirplaneModelEnum model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public void doAutoHealthCheck() {
        System.out.println(model + " - Starting auto health check");
        doSpecificAutoHealthCheck();
        System.out.println(model + " - Finished auto health check");
    }

    protected abstract void doSpecificAutoHealthCheck();

    public void showCapacity() {
        System.out.println(model + " - Accommodates " + capacity + " passangers");
    }

}
