package br.com.patterns.structural.adapter.approach01.adapter;

import br.com.patterns.structural.adapter.approach01.model.HdmiDevice;
import br.com.patterns.structural.adapter.approach01.model.VgaDevice;

public class VgaToHdmiDeviceApater implements HdmiDevice {

    //
    private final VgaDevice viceoDevice;

    public VgaToHdmiDeviceApater(VgaDevice viceoDevice) {
        System.out.println("Setting up VGA to HDMI video device adapter...");
        this.viceoDevice = viceoDevice;
    }


    @Override
    public void showImage(String content) {
        viceoDevice.showImage("[Adapter] " + content);
    }

    @Override
    public void executeSound(String sound) {
        System.out.println("Sorry, VGA devices do not support sound.");
    }
}
