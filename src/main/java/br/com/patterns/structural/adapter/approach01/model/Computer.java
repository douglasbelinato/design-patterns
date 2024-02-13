package br.com.patterns.structural.adapter.approach01.model;

public class Computer {

    private final HdmiDevice videoDevice;

    public Computer(HdmiDevice videoDevice) {
        System.out.println("Connecting on HDMI video device...");
        this.videoDevice = videoDevice;
    }

    public void showImageAndExecuteSound(String image, String sound) {
        if (videoDevice == null) {
            System.out.println("First, connect a video device");
        } else {
            videoDevice.showImage(image);
            videoDevice.executeSound(sound);
        }
    }



}
