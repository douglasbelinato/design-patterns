package br.com.patterns.creational.builder.approach02;

import br.com.patterns.creational.builder.approach02.model.Laptop;

public class Client {

    public static void main(String[] args) {
        var proLaptop = Laptop.builder().withCpu("i7").withMemory("32GB").withAdditionalInformation("Pro dev laptop").build();
        System.out.println(proLaptop);
        System.out.println("---------------------------");
        var basicLaptop = Laptop.builder().withCpu("i3").withMemory("8GB").withAdditionalInformation("Basic laptop").build();
        System.out.println(basicLaptop);
    }
}
