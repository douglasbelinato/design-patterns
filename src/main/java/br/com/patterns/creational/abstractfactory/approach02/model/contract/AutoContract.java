package br.com.patterns.creational.abstractfactory.approach02.model.contract;

public class AutoContract implements Contract {

    @Override
    public void showDetails() {
        System.out.println("Driver must have his/her a valid driver license. Penalty of $40 per day of delay.");
    }
}
