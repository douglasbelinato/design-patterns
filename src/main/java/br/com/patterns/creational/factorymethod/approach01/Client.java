package br.com.patterns.creational.factorymethod.approach01;

class Client {

    public static void main(String[] args) {
        execute(new AirbusA380FactoryMethod());
        execute(new AirbusA320FactoryMethod());
        execute(new Boeing747FactoryMethod());
        execute(new Boeing737FactoryMethod());
    }

    private static void execute(AirplaneFactoryMethod airplaneFactoryMethod) {
        var line = "----------------------------------------------------";

        System.out.println(line);

        var airplane = airplaneFactoryMethod.create();
        airplane.doAutoHealthCheck();
        airplane.showCapacity();

        System.out.println(line);
    }

}
