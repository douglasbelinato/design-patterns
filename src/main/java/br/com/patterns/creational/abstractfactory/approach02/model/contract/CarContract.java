package br.com.patterns.creational.abstractfactory.approach02.model.contract;

public class CarContract implements Contract {

    @Override
    public void showDetails() {
        System.out.println("Driver must have his/her a valid driver license. Penalty of $50 per day of delay.");
    }
}
