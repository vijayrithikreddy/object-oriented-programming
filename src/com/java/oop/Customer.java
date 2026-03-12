package com.java.oop;

public class Customer {
    //state
     int id;
     String name;
     String email;
     long mobileNo;
     byte age;
     char gender;
     String address;
     String password;
     boolean isActive;


    Customer() {
        System.out.println("Constructer() is called");
    }

    public Customer(int id, String name, String email,String password, byte age,long mobileNo, char gender, String address, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.password = password;
        this.isActive = isActive;
    }
}
