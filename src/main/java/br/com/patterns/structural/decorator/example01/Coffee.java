package br.com.patterns.structural.decorator.example01;

import java.math.BigDecimal;

public class Coffee implements Drink {

    @Override
    public String getName() {
        return "Simple coffe";
    }

    @Override
    public void prepare() {
        System.out.println("- Adding 50ml of coffee");
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("4.0");
    }
}
