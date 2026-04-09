package com.java.oop.java8.funtional;

import java.util.Scanner;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DiscountSystem {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product price : ");
        int price = scanner.nextInt();

        Predicate<Integer> isEligible = (p) -> p > 1000;
        Function<Integer,Double> discountedAmount;
        if (isEligible.test(price))
            discountedAmount = (amount) -> amount - (amount * 0.10);
        else
            discountedAmount = (amount) -> amount - 100.0;
        double finalPrice = discountedAmount.apply(price);

        Supplier<String> couponSupplier = () -> price > 1000 ? "EXTRA10%" : "FLAT_100";
        String coupon = couponSupplier.get();

        Consumer<String> print = (message) -> {
            System.out.println(message);
        };
        print.accept("Final price : " + finalPrice);
        print.accept("Coupon code : " + coupon);



    }
}
