package br.com.patterns.structural.decorator.approach01.example01;

import java.math.BigDecimal;

public class WhippedCream extends DrinkDecorator {

    public WhippedCream(Drink decotaratedDrink) {
        super(decotaratedDrink);
    }

    @Override
    public String getName() {
        return decotaratedDrink.getName() + " + Whipped Cream";
    }

    @Override
    public void prepare() {
        decotaratedDrink.prepare();
        System.out.println("- Adding whipped cream over it");
    }

    @Override
    public BigDecimal getPrice() {
        return decotaratedDrink.getPrice().add(BigDecimal.ONE);
    }
}
