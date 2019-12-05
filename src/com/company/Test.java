package com.company;

public class Test {
    public static void main(String[] args) {

        Adress adres = new Adress("piotrkowska","90-200","Lodz");
        Customer customer = new Customer("Adam");
        Customer customer1 = new Customer("Piotr");
        TravelOffice travelOffice = new TravelOffice();
        Trip aboardTrip= new AboardTrip(new Date(2019, 10, 13), new Date(2019, 10, 20),"Hiszpania",2000.1);
        Trip domesticTrip= new DomesticTrip(new Date(2019, 10, 13), new Date(2019, 10, 20),"Polska",2000.1);
        ((AboardTrip)aboardTrip).setInsurance(400.0);
        ((DomesticTrip)domesticTrip).setOwnArrivalDiscount(200.0);



        customer.assignTrip(domesticTrip);
        customer1.assignTrip(aboardTrip);

        customer.setAdress(adres);
        customer1.setAdress(adres);

        travelOffice.addCustomer(customer);
        travelOffice.addCustomer(customer1);

        System.out.println(travelOffice.getCustomerCount());
        System.out.println(travelOffice.toString());

    }
}
