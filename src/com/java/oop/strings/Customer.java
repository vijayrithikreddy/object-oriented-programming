package com.java.oop.strings;

public class Customer {
    //state
    public int id;
    public String name;
    public String email;
    public long mobileNo;


    Customer() {
        System.out.println("Constructer() is called");
    }

    public Customer(int id, String name, String email, long mobileNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
    }
    public static void displayAllCustomers(Customer[] customers){
        System.out.printf("%-5s %-20s %-30s %-15s\n", "ID", "NAME", "EMAIL", "NUMBER");
        for (Customer customer : customers){
            System.out.println("--------------------------------------------------------------------------");
            System.out.printf("%-5d %-20s %-30s %-15d\n", customer.id, customer.name, customer.email, customer.mobileNo);
        }
    }
}
