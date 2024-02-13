package br.com.patterns.creational.builder.approach01.model;

public class RoomBooking {

    private int stars;
    private String ammenitiesIncluded;

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getAmmenitiesIncluded() {
        return ammenitiesIncluded;
    }

    public void setAmmenitiesIncluded(String ammenitiesIncluded) {
        this.ammenitiesIncluded = ammenitiesIncluded;
    }

    @Override
    public String toString() {
        return "RoomBooking{" +
                "stars=" + stars +
                ", ammenitiesIncluded='" + ammenitiesIncluded + '\'' +
                '}';
    }
}
