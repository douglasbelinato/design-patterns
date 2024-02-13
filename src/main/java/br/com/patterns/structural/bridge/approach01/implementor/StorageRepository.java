package br.com.patterns.structural.bridge.approach01.implementor;

import br.com.patterns.structural.bridge.approach01.model.Entity;

import java.util.UUID;

// Right side of the bridge - Implementor
public interface StorageRepository {

    void save(Entity entity);

    default void generateId(Entity entity) {
        entity.setId(UUID.randomUUID().toString());
    }

}
