package com.java.oop.exception;

public class ProductService {
    ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    void addProduct(Product product) throws PriceLessthanZeroException,ProductAlreadyExistsException{
        if (productRepository.getById(product.getProductId()) != null)
            throw new ProductAlreadyExistsException("Product already exists");
        if (product.getPrice() < 0)
            throw new PriceLessthanZeroException("Price cannot be less than Zero");
        else
            productRepository.addProduct(product);
    }

    void purchaseProduct(Product product,int quantity) throws OutOfQuantityException{
        if (quantity > product.getQuantity())
            throw new OutOfQuantityException("Selected Quantity is Not Available");
        else
            productRepository.productPurchased(product,quantity);
    }

}
