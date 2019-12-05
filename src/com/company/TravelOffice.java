package com.company;

import java.util.Arrays;

public class TravelOffice {

    Customer [] customers = new Customer[2];

    int counter = 0;

    public void doubleCustomerSize()
    {
        customers = Arrays.copyOf(customers, customers.length+2);
    }
    public void addCustomer(Customer customer)
    {
      if(getCustomerCount()==customers.length)
      {
          doubleCustomerSize();
      }
        customers[counter++] = customer;
    }
    public int getCustomerCount()
    {
        return counter;

    }

    public String toString()
    {
        String s = "";
        for (Customer c : customers) {
            if(c == null) continue;
            s += c.toString() + "\n";
        }
        return  s;
    }


}
