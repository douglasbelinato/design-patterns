package br.com.patterns.creational.abstractfactory.approach02.model.contract;

public class BikeContract implements Contract {

    @Override
    public void showDetails() {
        System.out.println("Penalty of $20 per day of delay.");
    }
}
