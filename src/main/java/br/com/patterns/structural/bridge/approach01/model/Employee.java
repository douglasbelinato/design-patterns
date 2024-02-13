package br.com.patterns.structural.bridge.approach01.model;

public class Employee extends Entity {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
