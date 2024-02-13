package br.com.patterns.structural.adapter.approach01.model;

public class OldMonitorToHdmiDeviceAdapter extends OldMonitor implements HdmiDevice {

    @Override
    public void executeSound(String sound) {
        System.out.println("Sorry, VGA devices do not support sound.");
    }

}
