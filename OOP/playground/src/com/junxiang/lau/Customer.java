package com.junxiang.lau;

import netscape.javascript.JSObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Customer extends Person{
    private String name;
    private String id;
    private String nric;
    private String pin;
    private ArrayList<String> userAccounts;
    private ArrayList<String> bankAccounts;
    private HashMap<String, ArrayList<String>> userAccountHashMap = new HashMap<String, ArrayList<String>>();

    public Customer(){}
    public Customer(String name, String nric, String pin){
        this.name = name;
        this.nric = nric;
        this.pin = pin;
        String randomNumber = String.valueOf(getRandomNumber());
        this.id = "9500" + randomNumber;
        this.userAccounts = new ArrayList<String>();
        userAccounts.add(name);
        userAccounts.add(nric);
        userAccounts.add(pin);

        this.userAccountHashMap.put(id,userAccounts);

    }

    public ArrayList<String> getUserDetails(String id){
        return this.userAccountHashMap.get(id);
    }
    public String getCustomerId(){
        return this.id;
    }

    private int getRandomNumber() {
        int max = 1000;
        int min = 9999;
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
