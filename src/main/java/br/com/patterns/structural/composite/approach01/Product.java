package br.com.patterns.structural.composite.approach01;

import java.math.BigDecimal;

public class Product implements Container {

    private final BigDecimal price;

    public Product(BigDecimal price) {
        this.price = price;
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        return price;
    }

}
