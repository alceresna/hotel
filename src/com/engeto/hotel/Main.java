package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Guest guest1 = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
    Guest guest2 = new Guest("Jan","Dvoøáèek",LocalDate.of(1995,5,5));
    Room room1 = new Room(1,1,1000,true,true);
    Room room2 = new Room(2,1,1000,true,true);
    Room room3 = new Room(3,3,2400,false,true);
    System.out.println(guest1.getDescription());
    System.out.println(guest2.getDescription());
    System.out.println(room1.getDescription());
    System.out.println(room2.getDescription());
    System.out.println(room3.getDescription());
    Booking booking1 = new Booking(room1,guest1,LocalDate.of(2021,7,19),
            LocalDate.of(2021,7,26));
    Booking booking2 = new Booking(room3,guest1,LocalDate.of(2021,9,1),
            LocalDate.of(2021,9,14));
    booking2.addGuest(guest2);
    System.out.println(Booking.getListOfBookings());
    }

}
