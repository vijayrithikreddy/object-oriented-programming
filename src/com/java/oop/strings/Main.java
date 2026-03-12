

package com.java.oop.strings;
import com.java.oop.Customer;


public class Main {

    public static Customer[] getCustomersFromString(String[] customersData){
        Customer[] customers = new Customer[customersData.length];
        for (int index = 0; index < customersData.length; index++) {
            String[] split = customersData[index].split(",");
            Customer customer = new Customer(Integer.parseInt(split[0]), split[1], split[2], Long.parseLong(split[3]));
            customers[index] = customer;
        }
        return customers;
    }


    static void main(String[] args) {
        String[] customersData ={
                "1,Aarav Sharma,aarav.sharma@gmail.com,9876543210",
                "2,Riya Patel,riya.patel@gmail.com,9123456780",
                "3,Arjun Reddy,arjun.reddy@gmail.com,9988776655",
                "4,Neha Gupta,neha.gupta@gmail.com,9871234560",
                "5,Rahul Verma,rahul.verma@gmail.com,9012345678",
                "6,Priya Nair,priya.nair@gmail.com,9898989898",
                "7,Karthik Iyer,karthik.iyer@gmail.com,9345678901",
                "8,Sneha Singh,sneha.singh@gmail.com,9765432109",
                "9,Vikram Das,vikram.das@gmail.com,9556677889",
                "10,Ananya Mehta,ananya.mehta@gmail.com,9900112233"
        };
        Customer[] customers = getCustomersFromString(customersData);
        Customer.displayAllCustomers(customers);

    }
}
