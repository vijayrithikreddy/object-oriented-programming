
package com.java.oop;

public class Main {
    static void main(String[] args) {

        Customer customer = new Customer(101,"Vijay","vijay@gmail.com","vijay123",(byte)20,7396006512L,'M',"bowenpally",true);
        System.out.println("ID : " + customer.id);
        System.out.println("Name : " + customer.name);
        System.out.println("Age : " + customer.age);
        System.out.println("Gender : " + customer.gender);
        System.out.println("Address : " + customer.address);
        System.out.println("Mobile Number : " + customer.mobileNo);
        System.out.println("Email : " + customer.email);
        System.out.println("Password : " + customer.password);
        System.out.println("Is Active : " + customer.isActive);
        System.out.println();

        Customer customer1 = new Customer(102,"Rithik","rithik@gmail.com","rithik123",(byte)21,7396006512L,'M',"kompally",false);

        System.out.println("ID : " + customer1.id);
        System.out.println("Name : " + customer1.name);
        System.out.println("Age : " + customer1.age);
        System.out.println("Gender : " + customer1.gender);
        System.out.println("Address : " + customer1.address);
        System.out.println("Mobile Number : " + customer1.mobileNo);
        System.out.println("Email : " + customer1.email);
        System.out.println("Password : " + customer1.password);
        System.out.println("Is Active : " + customer1.isActive);
        System.out.println();

        Product product = new Product(1, "Iphone","Electronics","blue",59900,(byte)50,(byte)10);
        System.out.println("ID : " + product.productId);
        System.out.println("Name : " + product.productName);
        System.out.println("Category : " + product.productCategory);
        System.out.println("Colour : " + product.productColour);
        System.out.println("Price : " + product.price);
        System.out.println("Discount Percentage : " + product.discountPercentage);
        System.out.println("Rating : " + product.rating);
        System.out.println();

        Product product2 = new Product(2, "laptop","Electronics","grey",100000,(byte)30,(byte)9);
        System.out.println("ID : " + product2.productId);
        System.out.println("Name : " + product2.productName);
        System.out.println("Category : " + product2.productCategory);
        System.out.println("Colour : " + product2.productColour);
        System.out.println("Price : " + product2.price);
        System.out.println("Discount Percentage : " + product2.discountPercentage);
        System.out.println("Rating : " + product2.rating);
        System.out.println();

        Order order = new Order(12, "vijay", 7396006512L,"Bowenpally", 5000, "UPI");
        System.out.println("Order Id : " + order.orderId);
        System.out.println("Customer Name : " + order.customerName);
        System.out.println("Phone Number : " + order.customerPhoneNumber);
        System.out.println("Delivery Address : " + order.deliveryAddress);
        System.out.println("Amount Payable : " + order.amount);
        System.out.println("Payment Type : " + order.paymentType);
        System.out.println();

        Order order2 = new Order(21, "Rithik", 7396006512L,"Bowenpally", 8000, "Cash On Delivery");
        System.out.println("Order Id : " + order2.orderId);
        System.out.println("Customer Name : " + order2.customerName);
        System.out.println("Phone Number : " + order2.customerPhoneNumber);
        System.out.println("Delivery Address : " + order2.deliveryAddress);
        System.out.println("Amount Payable : " + order2.amount);
        System.out.println("Payment Type : " + order2.paymentType);
        System.out.println();

        Payment payment = new Payment(134, "Net Banking", "7396006512@ybl", 500000,"NEW100");
        System.out.println("Order Id : " + payment.orderId);
        System.out.println("Payment Type : " + payment.paymentType);
        System.out.println("UPI ID : " + payment.upi_Id);
        System.out.println("Amount Payable : " + payment.amount);
        System.out.println("Coupon Code: " + payment.couponCode);
        System.out.println();

        Payment payment2 = new Payment(145, "UPI", "7396006512@ybl", 1000,"NEW50");
        System.out.println("Order Id : " + payment2.orderId);
        System.out.println("Payment Type : " + payment2.paymentType);
        System.out.println("UPI ID : " + payment2.upi_Id);
        System.out.println("Amount Payable : " + payment2.amount);
        System.out.println("Coupon Code: " + payment2.couponCode);
        System.out.println();
    }
}
