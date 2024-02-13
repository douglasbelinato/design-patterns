package br.com.patterns.creational.builder.approach01.builder;

import br.com.patterns.creational.builder.approach01.model.RoomBooking;

public abstract class RoomBookingBuilder {

    protected RoomBooking roomBooking;

    protected RoomBookingBuilder() {
        this.roomBooking = new RoomBooking();
    }

    public RoomBooking getRoomBooking() {
        return this.roomBooking;
    }

    public abstract void buildStars();
    public abstract void buildAmmenitiesIncluded();

}
