package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {

    static ArrayList<Booking> listOfBookings = new ArrayList<>();
    enum TypeOfVacation{
        WORKING,RECREATIONAL
    }
    Room room;
    ArrayList<Guest> guests = new ArrayList<>();
    LocalDate begin;
    LocalDate end;
    TypeOfVacation typeOfVacation;

    public Booking(Room room,Guest guest,LocalDate begin,LocalDate end,TypeOfVacation typeOfVacation){
        this.room = room;
        guests.add(guest);
        this.begin = begin;
        this.end = end;
        this.typeOfVacation = typeOfVacation;
        listOfBookings.add(this);
    }
    public Booking(Room room,Guest guest,LocalDate begin,LocalDate end){
        this(room,guest,begin,end,TypeOfVacation.RECREATIONAL);
    }

    public Booking(Room room,Guest guest){
        this(room,guest,LocalDate.now(),LocalDate.now().plusDays(6));
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void addGuest(Guest guest){
        guests.add(guest);
    }
    public void removeGuest(Guest guest){
        guests.remove(guest);
    }
    public ArrayList<Guest> getGuests(){
        return new ArrayList<>(guests);
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(TypeOfVacation typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }


    //gets a text description of this booking
    public String getDescription(){
        String namesOfGuests = new String("");
        for (Guest guest:guests){
            namesOfGuests += guest.firstName+" "+guest.lastName+", ";
        }

        return new String("Rezervace na pokoj èíslo "+room.getNumber()+" je zapsána na hosty: "+namesOfGuests+
                "\n"+"zaèíná "+begin.getDayOfMonth()+
                "."+begin.getMonthValue()+"."+begin.getYear()+", konèí "+end.getDayOfMonth()+"."+end.getMonthValue()+
                "."+end.getYear()+"\n"+"typ pobytu: "+
                (typeOfVacation.equals(TypeOfVacation.RECREATIONAL) ? "rekreaèní":"pracovní")+
                "\njestliže chcete pøidat více hostù,použijte metodu addGuest\n");
    }


    //gets a text description of all bookings
    public static String getListOfBookings(){
        String list = new String("");
        for (Booking booking:listOfBookings){
           list += booking.getDescription()+"\n";
        }
        return new String ("Seznam pobytù: \n\n"+list);
    }

}
