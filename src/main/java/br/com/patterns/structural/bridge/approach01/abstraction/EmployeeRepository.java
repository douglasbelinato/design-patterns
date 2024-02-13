package br.com.patterns.structural.bridge.approach01.abstraction;

import br.com.patterns.structural.bridge.approach01.implementor.StorageRepository;
import br.com.patterns.structural.bridge.approach01.model.Employee;

// Left side of the bridge - Concrete abstraction
public class EmployeeRepository extends AbstractBaseRepository<Employee> {

    public EmployeeRepository(StorageRepository storageRepository) {
        super(storageRepository);
    }

    @Override
    public void save(Employee employee) {
        this.storageRepository.save(employee);
    }

}
