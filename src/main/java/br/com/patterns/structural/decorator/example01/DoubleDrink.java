package br.com.patterns.structural.decorator.example01;

import java.math.BigDecimal;

public class DoubleDrink extends DrinkDecorator {

    public DoubleDrink(Drink decotaratedDrink) {
        super(decotaratedDrink);
    }

    @Override
    public String getName() {
        return decotaratedDrink.getName() + " Double";
    }

    @Override
    public void prepare() {
        decotaratedDrink.prepare();
        decotaratedDrink.prepare();
    }

    @Override
    public BigDecimal getPrice() {
        return decotaratedDrink.getPrice().multiply(new BigDecimal("2"));
    }
}
