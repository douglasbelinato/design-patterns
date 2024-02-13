package br.com.patterns.creational.builder.approach01;

import br.com.patterns.creational.builder.approach01.builder.FiveStarsRoomBookingBuilder;
import br.com.patterns.creational.builder.approach01.builder.FourStarsRoomBookingBuilder;
import br.com.patterns.creational.builder.approach01.builder.RoomBookingBuilder;
import br.com.patterns.creational.builder.approach01.director.RoomBookingDirector;

class Client {

    public static void main(String[] args) {
        construct(new FourStarsRoomBookingBuilder());
        construct(new FiveStarsRoomBookingBuilder());
    }

    private static void construct(RoomBookingBuilder builder) {
        var director = new RoomBookingDirector(builder);
        director.constructRoomBooking();
        System.out.println(director.getRoomBooking());
        System.out.println("-----------------------------------");
    }

}
