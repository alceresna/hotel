package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {

    private enum TypeOfVacation {
        WORKING,RECREATIONAL
    }
    private Room room;
    private ArrayList<Guest> guests = new ArrayList<>();
    private LocalDate begin;
    private LocalDate end;
    private TypeOfVacation typeOfVacation;

    public Booking(Room room, Guest guest, LocalDate begin, LocalDate end, TypeOfVacation typeOfVacation) {
        this.room = room;
        guests.add(guest);
        this.begin = begin;
        this.end = end;
        this.typeOfVacation = typeOfVacation;
        ListOfBookings.addBooking(this);
    }
    public Booking(Room room, Guest guest, LocalDate begin, LocalDate end) {
        this(room, guest, begin, end, TypeOfVacation.RECREATIONAL);
    }

    public Booking(Room room, Guest guest) {
        this(room, guest, LocalDate.now(), LocalDate.now().plusDays(6));
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
        if(guests.size()>=2) guests.remove(guest);
        else System.out.println("Každý pobyt musí být zapsán alespoò na jednoho hosta");
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


    //gets a text description of specific booking
    public String getDescription() {
        String namesOfGuests = "";
        for (Guest guest : guests) {
            namesOfGuests += guest.getFirstName() + " " + guest.getLastName() + ", ";
        }

        String description = "Rezervace na pokoj èíslo " + room.getNumber() + " je zapsána na hosty: " + namesOfGuests +
                "\n" + "zaèíná " + begin.getDayOfMonth() +
                "." + begin.getMonthValue() + "." + begin.getYear() + ", konèí " + end.getDayOfMonth() + "." + end.getMonthValue() +
                "." + end.getYear() + "\n" + "typ pobytu: " +
                (typeOfVacation.equals(TypeOfVacation.RECREATIONAL) ? "rekreaèní" : "pracovní") +
                "\njestliže chcete pøidat více hostù,použijte metodu addGuest\n" +
                "jestliže chcete odebrat hosta,použijte metodu removeGuest\n";
        return description;
    }

}
