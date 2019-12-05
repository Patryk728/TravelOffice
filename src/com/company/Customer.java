package com.company;

public class Customer {
    private String name;
    private Adress adres;
    private Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setAdress(Adress adres) {
        this.adres = adres;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    public String toString() {
        return " Imie: "+name +"\n"+ adres.toString() +"\n"+ trip.toString();
    }
}
