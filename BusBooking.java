package com.travel;

public class BusBooking extends Booking {
    private String busType;
    private double fare;

    public BusBooking(int bookingId, String passengerName, String source, String destination, String busType, double fare) {
        super(bookingId, passengerName, source, destination);
        this.busType = busType;
        this.fare = fare;
    }

    @Override
    public void displayDetails() {
        System.out.println("🚌 Bus Booking ID: " + bookingId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Route: " + source + " → " + destination);
        System.out.println("Bus Type: " + busType);
        System.out.println("Fare: ₹" + fare);
        System.out.println("-------------------------------");
    }
}
