package com.junxiang.lau;

public abstract class Person {
    private String name;
    private int id;
    private String email;
    abstract String getName();
    abstract void setName(String name);

    public Person(){

    }
}
