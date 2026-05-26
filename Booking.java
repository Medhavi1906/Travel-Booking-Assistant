package com.travel;

public abstract class Booking {
    protected int bookingId;
    protected String passengerName;
    protected String source;
    protected String destination;

    public Booking(int bookingId, String passengerName, String source, String destination) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
    }

    public int getBookingId() {
        return bookingId;
    }

    public abstract void displayDetails();
}
