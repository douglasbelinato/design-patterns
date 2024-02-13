package br.com.patterns.creational.builder.approach01.director;

import br.com.patterns.creational.builder.approach01.builder.RoomBookingBuilder;
import br.com.patterns.creational.builder.approach01.model.RoomBooking;

public class RoomBookingDirector {

    private final RoomBookingBuilder builder;

    public RoomBookingDirector(RoomBookingBuilder builder) {
        this.builder = builder;
    }

    public void constructRoomBooking() {
        // Control and encapsulate the order of construction
        this.builder.buildStars();
        this.builder.buildAmmenitiesIncluded();
    }

    public RoomBooking getRoomBooking() {
        return builder.getRoomBooking();
    }

}
