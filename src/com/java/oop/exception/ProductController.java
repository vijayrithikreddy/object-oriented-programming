package com.java.oop.exception;

public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Add Product
    void addProduct(Product product) {
        try {
            productService.addProduct(product);
            System.out.println("Product added successfully");
        } catch (PriceLessthanZeroException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ProductAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Purchase Product
    void purchaseProduct(Product product, int quantity) {
        try {
            productService.purchaseProduct(product, quantity);
            System.out.println("Product purchased successfully");
        } catch (OutOfQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}