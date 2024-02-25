package br.com.patterns.structural.decorator.approach01.example01;

import java.math.BigDecimal;

public class Milk extends DrinkDecorator {

    public Milk(Drink decotaratedDrink) {
        super(decotaratedDrink);
    }

    @Override
    public String getName() {
        return decotaratedDrink.getName() + " + Milk";
    }

    @Override
    public void prepare() {
        decotaratedDrink.prepare();
        System.out.println("- Adding 50ml of milk");
    }

    @Override
    public BigDecimal getPrice() {
        return decotaratedDrink.getPrice().add(new BigDecimal("2.5"));
    }
}
