package com.travel;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Booking> bookings = new ArrayList<>();
    static int nextBookingId = 1001;

    public static void main(String[] args) {
        System.out.println("=== Travel Booking Assistant ===");
        int choice;
        do {
            System.out.println("\n1. Book Train Ticket");
            System.out.println("2. Book Bus Ticket");
            System.out.println("3. View All Bookings");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: bookTrain(); break;
                case 2: bookBus(); break;
                case 3: viewBookings(); break;
                case 4: cancelBooking(); break;
                case 5: System.out.println("Thank you for using Travel Booking Assistant!"); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    static void bookTrain() {
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Source: ");
        String source = sc.nextLine();
        System.out.print("Enter Destination: ");
        String dest = sc.nextLine();
        System.out.print("Enter Class (Sleeper/AC/General): ");
        String cls = sc.nextLine();
        System.out.print("Enter Fare: ");
        double fare = sc.nextDouble();
        sc.nextLine();

        Booking t = new TrainBooking(nextBookingId++, name, source, dest, cls, fare);
        bookings.add(t);
        System.out.println("✅ Train booking successful!");
    }

    static void bookBus() {
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Source: ");
        String source = sc.nextLine();
        System.out.print("Enter Destination: ");
        String dest = sc.nextLine();
        System.out.print("Enter Bus Type (AC/Non-AC/Sleeper): ");
        String busType = sc.nextLine();
        System.out.print("Enter Fare: ");
        double fare = sc.nextDouble();
        sc.nextLine();

        Booking b = new BusBooking(nextBookingId++, name, source, dest, busType, fare);
        bookings.add(b);
        System.out.println("✅ Bus booking successful!");
    }

    static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            System.out.println("\n=== All Bookings ===");
            for (Booking b : bookings) b.displayDetails();
        }
    }

    static void cancelBooking() {
        System.out.print("Enter Booking ID to cancel: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getBookingId() == id) {
                bookings.remove(i);
                found = true;
                System.out.println("❌ Booking ID " + id + " cancelled successfully!");
                break;
            }
        }

        if (!found)
            System.out.println("⚠️ Booking ID not found!");
    }
}
