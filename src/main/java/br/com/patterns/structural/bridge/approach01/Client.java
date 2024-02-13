package br.com.patterns.structural.bridge.approach01;

import br.com.patterns.structural.bridge.approach01.abstraction.EmployeeRepository;
import br.com.patterns.structural.bridge.approach01.abstraction.JobRepository;
import br.com.patterns.structural.bridge.approach01.implementor.DatabaseStorageRepositoryImpl;
import br.com.patterns.structural.bridge.approach01.implementor.FileStorageRepositoryImpl;
import br.com.patterns.structural.bridge.approach01.model.Employee;
import br.com.patterns.structural.bridge.approach01.model.Job;

public class Client {

    public static void main(String[] args) {
        var employee = new Employee("Jhon");

        var employeeRepositoryForFile = new EmployeeRepository(new FileStorageRepositoryImpl());
        employeeRepositoryForFile.save(employee);

        var employeeRepositoryForDatabase = new EmployeeRepository(new DatabaseStorageRepositoryImpl());
        employeeRepositoryForDatabase.save(employee);

        System.out.println("--------------------------------------------------------------");

        var job = new Job("Developer");

        var jobRepositoryForFile = new JobRepository(new FileStorageRepositoryImpl());
        jobRepositoryForFile.save(job);

        var jobRepositoryForDatabase = new JobRepository(new DatabaseStorageRepositoryImpl());
        jobRepositoryForDatabase.save(job);
    }
}
