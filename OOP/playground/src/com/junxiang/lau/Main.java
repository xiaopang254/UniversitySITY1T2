package com.junxiang.lau;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Customer customer = new Customer("John", "S1234567A", "Some Super Secret Password");
        Customer customer2 = new Customer("Uniqlo","S1234568A","Not so super secret Password...");
        System.out.println("Hello");

        ArrayList<String> customerDetails = customer.getUserDetails(customer.getCustomerId());

        for (int i=0; i < customerDetails.size(); i++) {
            System.out.println("Details from HashMap:" + customerDetails.get(i));
        }


        String id = customer2.getCustomerId();
        ArrayList<String> cus2 = customer2.getUserDetails(id);

        for (int i=0; i < cus2.size(); i++) {
            System.out.println("Details from HashMap2:" + cus2.get(i));
        }
    }
}
