package br.com.patterns.creational.builder.approach01.builder;

public class FiveStarsRoomBookingBuilder extends RoomBookingBuilder {

    @Override
    public void buildStars() {
        this.roomBooking.setStars(5);
    }

    @Override
    public void buildAmmenitiesIncluded() {
        this.roomBooking.setAmmenitiesIncluded("Wi-fi, hotel pool, breakfast, dinner, massage, spa, sports club");
    }
}
