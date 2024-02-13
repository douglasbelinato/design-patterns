package br.com.patterns.structural.adapter.approach01;

import br.com.patterns.structural.adapter.approach01.adapter.OldMonitorToHdmiDeviceAdapter;
import br.com.patterns.structural.adapter.approach01.adapter.VgaToHdmiDeviceApater;
import br.com.patterns.structural.adapter.approach01.model.Computer;
import br.com.patterns.structural.adapter.approach01.model.OldMonitor;
import br.com.patterns.structural.adapter.approach01.model.SmartTV;

public class Client {

    public static void main(String[] args) {
        // Executing code without adaptera as it is not required
        var computer1 = new Computer(new SmartTV());
        computer1.showImageAndExecuteSound("Goku and Frieza fighting", "Kaaa...meee...haaa...meee...haaaaaaa");

        System.out.println("----------------------------------------------------------------");

        // Using objct adapter approach (using composition in the adapter)
        var vgaToHdmiDeviceApater = new VgaToHdmiDeviceApater(new OldMonitor());
        var computer2 = new Computer(vgaToHdmiDeviceApater);
        computer2.showImageAndExecuteSound("Goku and Frieza fighting", "Kaaa...meee...haaa...meee...haaaaaaa");

        System.out.println("----------------------------------------------------------------");

        // Using class adapter approach  (using inheritance to extend the OldMonitor)
        var oldMonitorVgaToHdmiDeviceAdapter = new OldMonitorToHdmiDeviceAdapter();
        var computer3 = new Computer(oldMonitorVgaToHdmiDeviceAdapter);
        computer3.showImageAndExecuteSound("Fullmetal alchemist opening", "Opening sound");
    }
}
