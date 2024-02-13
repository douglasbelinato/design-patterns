package br.com.patterns.structural.bridge.approach01.abstraction;

import br.com.patterns.structural.bridge.approach01.implementor.StorageRepository;

// Left side of the bridge - Abstraction
public abstract class AbstractBaseRepository<T> implements BaseRepository<T> {

    protected final StorageRepository storageRepository;

    protected AbstractBaseRepository(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

}
