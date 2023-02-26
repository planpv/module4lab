package com.mycompany.airlinereservationsystem;
import java.util.Scanner;
/**
 * @author Phillip Plangetis
 * Date: 2/25/23
 * Program: Airline Flight Reservation System
 */
public class NewReservations {
    Scanner input = newScanner(System.in);
    boolean[] flightSeats = new boolean[11];
    public void start()
    {
        while ( true )
        {
            seatBooking();
        }
    }
    public void seatBooking()
    {
        System.out.println("Type 1 for First Class. Type 2 for Economy Class.");
        int passengarClass = input.nextInt();
        if (passengarClass == 1)
        {
            firstClassBooking();
        }
        else {
            economyClassBooking();
        }
    }
    public void firstClassBooking() {
        for (int count = 1; count <=5; count++) {
            if (flightSeats[count] == false)
            {
                flightSeats[count] = true;
                System.out.printf("First Class Booking: Seat# %d\n", count);
                break;
            }
            else if (flightSeats[5] == true) {
                if (flightSeats[10] == true) {
                    System.out.println("All seats are booked");
                }
                else
                {
                    System.out.println("First Class Bookings are Unavailable, "
                            + "press 1 to opt for Economy, press 2 to to not opt for Economy");
                    int selection = input.nextInt();
                    if ( selection == 1) {
                        economyClassBooking();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is available");
                        System.exit(0);
                    }
                }
            }
        }
    }
    public void economyClassBooking() {
        for (int count = 6; count <= 10; count++) {
            if (flightSeats[count] == false) {
                flightSeats[count] = true;
                System.out.printf("Ecnonomy Class Booking: Seat# %d\n", count);
                break;
            }
            else if (flightSeats[10] == true) {
                if (flightSeats[5] == true) {
                    System.out.println("All seats are booke!");
                    System.exit(0);
                }
                else {
                    System.out.println("Ecnomy Class is Unavailable, press 1 to opt for First Class Seating, "
                            + "press 2 to not opt for first class");
                    int selection = input.nextInt();
                    if (selection == 1) {
                        firstClassBooking();
                        start();
                    }
                    else {
                        System.out.println("All seats are booked!");
                        System.exit(0);
                    }
                }
            }
        }
    }
}