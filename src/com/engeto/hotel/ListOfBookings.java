package com.engeto.hotel;

import java.util.ArrayList;

public class ListOfBookings {

    private static ArrayList<Booking> listOfBookings = new ArrayList<>();

    public static void addBooking(Booking booking) {
        listOfBookings.add(booking);
    }

    //gets list of all Bookings
    public static String getListOfBookings() {
        String list ="";
        for (Booking booking:listOfBookings) {
            list += booking.getDescription()+"\n";
        }
        String listOfBookings = ("Seznam pobytù: \n\n"+list);
        return listOfBookings;
    }

}
