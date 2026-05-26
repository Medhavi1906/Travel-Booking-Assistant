package com.travel;

public class TrainBooking extends Booking {
    private String trainClass;
    private double fare;

    public TrainBooking(int bookingId, String passengerName, String source, String destination, String trainClass, double fare) {
        super(bookingId, passengerName, source, destination);
        this.trainClass = trainClass;
        this.fare = fare;
    }

    @Override
    public void displayDetails() {
        System.out.println("🚆 Train Booking ID: " + bookingId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Route: " + source + " → " + destination);
        System.out.println("Train Class: " + trainClass);
        System.out.println("Fare: ₹" + fare);
        System.out.println("-------------------------------");
    }
}
