package br.com.patterns.creational.abstractfactory.approach02;

import br.com.patterns.creational.abstractfactory.approach02.model.Vehicle;
import br.com.patterns.creational.abstractfactory.approach02.model.car.MegaCar;
import br.com.patterns.creational.abstractfactory.approach02.model.car.MicroCar;
import br.com.patterns.creational.abstractfactory.approach02.model.car.MiniCar;
import br.com.patterns.creational.abstractfactory.approach02.model.contract.CarContract;
import br.com.patterns.creational.abstractfactory.approach02.model.contract.Contract;

public class CarFactory extends AbstractVehicleFactory {

    @Override
    public Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("Micro")) {
            return new MicroCar();
        } else if (type.equalsIgnoreCase("Mini")) {
            return new MiniCar();
        } else if (type.equalsIgnoreCase("Mega")) {
            return new MegaCar();
        } else {
            return new MiniCar();
        }
    }

    @Override
    public Contract getContract() {
        return new CarContract();
    }
}
