package com.java.oop.exception;


public class Main {
    static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);
        ProductController productController = new ProductController(productService);
        Product product1 = new Product();
        product1.setProductId(101).setName("Laptop").setPrice(79999).setQuantity(10);
        productController.addProduct(product1);

        Product product2 = new Product();
        product2.setProductId(103).setName("Iphone").setPrice(89900).setQuantity(999);
        productController.addProduct(product2);
        productController.purchaseProduct(product1,21);
    }
}
