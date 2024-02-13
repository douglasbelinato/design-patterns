package br.com.patterns.structural.adapter.approach01.model;

public class OldMonitor implements VgaDevice {

    @Override
    public void showImage(String content) {
        System.out.println("Showing image content: " + content);
    }

}
