package br.com.patterns.structural.decorator.example01;

public abstract class DrinkDecorator implements Drink {

    protected final Drink decotaratedDrink;

    public DrinkDecorator(Drink decotaratedDrink) {
        this.decotaratedDrink = decotaratedDrink;
    }

}
