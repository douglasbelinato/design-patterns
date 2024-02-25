package br.com.patterns.structural.decorator.approach01.example01;

public class Client {

    public static void main(String[] args) {
        var simpleCoffee = new Coffee();
        order(simpleCoffee);

        var milkDecorator = new Milk(simpleCoffee);
        order(milkDecorator);

        var whippedCreamDecorator = new WhippedCream(milkDecorator);
        order(whippedCreamDecorator);

        var doubleDrinkCoffee = new DoubleDrink(new Coffee());
        order(doubleDrinkCoffee);
    }

    private static void order(Drink drink) {
        System.out.println("Ordering a " + drink.getName() + " / Price => " + drink.getPrice());
        drink.prepare();
        System.out.println("Done!");
        System.out.println("----------------------------------------------");

    }
}
