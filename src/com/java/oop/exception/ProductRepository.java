package com.java.oop.exception;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    // Add product
    void addProduct(Product product){
        products.add(product);
    }

    // Get product by ID
    Product getById(int id){
        for (Product product : products){
            if (product.getProductId() == id){
                return product;
            }
        }
        return null;
    }

    // Delete product
    void deleteById(int id){
        Product product = getById(id);
        if (product != null){
            products.remove(product);
        }
    }

    // Reduce quantity
    void productPurchased(Product product, int quantity){
        product.setQuantity(product.getQuantity() - quantity);
    }
}