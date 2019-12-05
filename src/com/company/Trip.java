package com.company;


public class Trip {
    private Date start;
    private Date end;
    private String destination;
    private Double price;

    public Trip(Date start, Date end, String destination, Double price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;
    }

    public String toString() {
        return  " Mijesce wycieczki: "+destination +" poczatek: "+ start.toString() +" koniec: "+ end.toString()+" cena: "+getPrice().toString();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
