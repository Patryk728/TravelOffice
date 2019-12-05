package com.company;

public class DomesticTrip extends Trip {

    private Double ownArrivalDiscount;


    public DomesticTrip(Date start, Date end, String destination,Double price) {
        super(start, end, destination,price);
    }



    public void setOwnArrivalDiscount(Double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public Double getPrice() {
        return super.getPrice()-ownArrivalDiscount;
    }
}
