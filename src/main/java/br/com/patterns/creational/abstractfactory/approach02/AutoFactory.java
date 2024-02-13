package br.com.patterns.creational.abstractfactory.approach02;

import br.com.patterns.creational.abstractfactory.approach02.model.Vehicle;
import br.com.patterns.creational.abstractfactory.approach02.model.auto.PersonalAuto;
import br.com.patterns.creational.abstractfactory.approach02.model.auto.SharedAuto;
import br.com.patterns.creational.abstractfactory.approach02.model.contract.AutoContract;
import br.com.patterns.creational.abstractfactory.approach02.model.contract.Contract;

public class AutoFactory extends AbstractVehicleFactory {

    @Override
    public Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("Personal")) {
            return new PersonalAuto();
        } else if (type.equalsIgnoreCase("Shared")) {
            return new SharedAuto();
        } else {
            return new PersonalAuto();
        }
    }

    @Override
    public Contract getContract() {
        return new AutoContract();
    }
}
