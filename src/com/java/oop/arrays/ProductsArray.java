package com.java.oop.arrays;

public class ProductsArray {
    static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(1, "laptop", 590000, 7.9f, 5.5f, true);
        products[1] = new Product(2, "laptop1", 554300, 7.9f, 5.5f, true);
        products[2] = new Product(3, "laptop2", 593400, 7.9f, 5.5f, true);
        products[3] = new Product(4, "laptop3", 543300, 7.9f, 5.5f, true);
        products[4] = new Product(5, "laptop4", 576700, 7.9f, 5.5f, true);

        for(int i = 0; i < products.length; i++){

            products[i].discountPercentage += 5;
            System.out.println("Id : " + products[i].id);
            System.out.println("Name : " + products[i].name);
            System.out.println("Max Retail Price : " + products[i].maxRetailPrice);
            System.out.println("Discount Percentage : " + products[i].discountPercentage);
            System.out.println("Rating : " + products[i].rating);
            System.out.println("Is Stock Available : " + products[i].isStockAvailable);
            System.out.println("Discount amount : " + products[i].getDiscountAmount());
            System.out.println("Final Price : " + products[i].getFinalPrice());
        }




    }
}
