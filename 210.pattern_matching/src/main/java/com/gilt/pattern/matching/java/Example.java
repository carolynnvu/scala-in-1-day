package com.gilt.pattern.matching.java;

public class Example {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.items.add(new Book(10));
        cart.items.add(new Clothes(40));
        cart.items.add(new Food(12));
        System.out.println("tax = " + cart.computeTax());
    }
}
