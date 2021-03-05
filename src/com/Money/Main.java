package com.Money;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("Any product",new Money(Currency.UAH,18.25));
        System.out.println(product.toString());
    }
}
