package br.com.patterns.structural.bridge.approach01.implementor;

import br.com.patterns.structural.bridge.approach01.model.Entity;

// Right side of the bridge - Concrete implementor
public class FileStorageRepositoryImpl implements StorageRepository {

    @Override
    public void save(Entity entity) {
        generateId(entity);
        System.out.println("Saving on file the object " + entity);
    }
}
