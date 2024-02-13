package br.com.patterns.creational.abstractfactory.approach02;

import br.com.patterns.creational.abstractfactory.approach02.model.Vehicle;
import br.com.patterns.creational.abstractfactory.approach02.model.contract.Contract;

public abstract class AbstractVehicleFactory {

    public abstract Vehicle getVehicle(String type);

    public abstract Contract getContract();

}
