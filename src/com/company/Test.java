package com.company;

public class Test {
    public static void main(String[] args) {

        Adress adres = new Adress("piotrkowska","90-200","Lodz");
        Customer customer = new Customer("Adam");
        Customer customer1 = new Customer("Piotr");

        AboardTrip aboardTrip= new AboardTrip(new Date(2019, 10, 13), new Date(2019, 10, 20),"Hiszpania",2000.1);
        DomesticTrip domesticTrip= new DomesticTrip(new Date(2019, 10, 13), new Date(2019, 10, 20),"Polska",2000.1);
        aboardTrip.setInsurance(400.0);
        domesticTrip.setOwnArrivalDiscount(200.0);


        TravelOffice travelOffice = new TravelOffice();
        customer.assignTrip(domesticTrip);
        customer.setAdress(adres);

        customer1.assignTrip(aboardTrip);
        customer1.setAdress(adres);

        travelOffice.addCustomer(customer);
        travelOffice.addCustomer(customer1);

        System.out.println(travelOffice.getCustomerCount());
        System.out.println(travelOffice.toString());

    }
}
