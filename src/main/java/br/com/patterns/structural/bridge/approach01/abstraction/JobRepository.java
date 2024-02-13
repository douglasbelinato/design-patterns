package br.com.patterns.structural.bridge.approach01.abstraction;

import br.com.patterns.structural.bridge.approach01.implementor.StorageRepository;
import br.com.patterns.structural.bridge.approach01.model.Job;

// Left side of the bridge - Concrete abstraction
public class JobRepository extends AbstractBaseRepository<Job> {

    public JobRepository(StorageRepository storageRepository) {
        super(storageRepository);
    }

    @Override
    public void save(Job job) {
        this.storageRepository.save(job);
    }

}
