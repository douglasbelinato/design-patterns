package br.com.patterns.creational.abstractfactory.approach02;

import br.com.patterns.creational.abstractfactory.approach02.model.Vehicle;
import br.com.patterns.creational.abstractfactory.approach02.model.bike.NormalBike;
import br.com.patterns.creational.abstractfactory.approach02.model.bike.SportsBike;
import br.com.patterns.creational.abstractfactory.approach02.model.contract.BikeContract;
import br.com.patterns.creational.abstractfactory.approach02.model.contract.Contract;

public class BikeFactory extends AbstractVehicleFactory {

    @Override
    public Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("Normal")) {
            return new NormalBike();
        } else if (type.equalsIgnoreCase("Sports")) {
            return new SportsBike();
        } else {
            return new NormalBike();
        }
    }

    @Override
    public Contract getContract() {
        return new BikeContract();
    }
}
