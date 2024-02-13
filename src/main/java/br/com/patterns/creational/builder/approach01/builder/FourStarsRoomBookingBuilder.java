package br.com.patterns.creational.builder.approach01.builder;

public class FourStarsRoomBookingBuilder extends RoomBookingBuilder {

    @Override
    public void buildStars() {
        this.roomBooking.setStars(4);
    }

    @Override
    public void buildAmmenitiesIncluded() {
        this.roomBooking.setAmmenitiesIncluded("Wi-fi, hotel pool, breakfast, dinner");
    }
}
