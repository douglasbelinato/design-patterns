package br.com.patterns.structural.composite.approach01.example01;

import java.math.BigDecimal;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        // Tree leaves
        var ps5 = new Product(new BigDecimal("4200.50"));
        var nintendoSwitch = new Product(new BigDecimal("2500"));
        var keypad = new Product(new BigDecimal("40"));
        var mouse = new Product(new BigDecimal("10"));
        var schoolbag = new Product(new BigDecimal("50"));

        // Container which holds leaves and other containers
        var smallerBoxForConsoles = new Box(List.of(ps5, nintendoSwitch), BigDecimal.ONE);
        var smallerBoxForPcItens = new Box(List.of(keypad, mouse), BigDecimal.ONE);

        // Origin Node - Complex Order
        var complexOrder = new Box(List.of(smallerBoxForConsoles, smallerBoxForPcItens, schoolbag),
                BigDecimal.TEN);

        // Retrieving the total price recursively
        System.out.println("Total order price ==> " + complexOrder.calculateTotalPrice());
    }
}
