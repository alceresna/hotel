package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {

    private String firstName;
    private String lastName;
    private LocalDate born;

    public Guest(String firstName, String lastName, LocalDate born) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.born = born;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    //gets a text description of specific guest
    public String getDescription() {
        String description = "Jm�no hosta je "+firstName+" "+lastName+", datum narozen� je "+born.getDayOfMonth()+
                "."+born.getMonthValue()+"."+born.getYear()+"\n";
        return description;
    }

}
