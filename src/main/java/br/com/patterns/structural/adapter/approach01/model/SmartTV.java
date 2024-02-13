package br.com.patterns.structural.adapter.approach01.model;

public class SmartTV implements HdmiDevice {

    @Override
    public void showImage(String content) {
        System.out.println("Showing image content: " + content);
    }

    @Override
    public void executeSound(String sound) {
        System.out.println("Executing sound: " + sound);
    }
}
