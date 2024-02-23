package br.com.patterns.structural.composite.approach01;

import java.math.BigDecimal;
import java.security.InvalidParameterException;
import java.util.List;

public class Box implements Container {

    private final List<Container> children;
    private final BigDecimal packagingPrice;

    public Box(List<Container> children, BigDecimal packagingPrice) {
        if (children == null || children.isEmpty()) {
            throw new InvalidParameterException("A box must have at least one item inside it");
        }
        this.children = children;
        this.packagingPrice = packagingPrice;
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        var childrenPrices = children.stream().map(Container::calculateTotalPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
        return packagingPrice.add(childrenPrices);
    }

}
