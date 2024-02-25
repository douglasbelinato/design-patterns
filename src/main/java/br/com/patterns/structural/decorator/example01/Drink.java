package br.com.patterns.structural.decorator.example01;

import java.math.BigDecimal;

public interface Drink {

    String getName();
    void prepare();
    BigDecimal getPrice();

}
