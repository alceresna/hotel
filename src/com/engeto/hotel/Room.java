package com.engeto.hotel;

public class Room {

    private int number;
    private int beds;
    private int price;
    private boolean haveBalcony;
    private boolean haveViewAtSea;

    public Room(int number, int beds, int price, boolean haveBalcony, boolean haveViewAtSea) {
        this.number = number;
        this.beds = beds;
        this.price = price;
        this.haveBalcony = haveBalcony;
        this.haveViewAtSea = haveViewAtSea;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHaveBalcony() {
        return haveBalcony;
    }

    public void setHaveBalcony(boolean haveBalcony) {
        this.haveBalcony = haveBalcony;
    }

    public boolean isHaveViewAtSea() {
        return haveViewAtSea;
    }

    public void setHaveViewAtSea(boolean haveViewAtSea) {
        this.haveViewAtSea = haveViewAtSea;
    }

    //gets a text description of specific room
    public String getDescription() {
        String description = ("Pokoj "+number+": po�et postel� je "+beds+", cena je "+price+"K�, pokoj "+(haveBalcony ? "":"ne")+
                "m� balk�n, "+(haveViewAtSea ? "":"ne")+"m� v�hled na mo�e\n");
        return description;
    }
}
