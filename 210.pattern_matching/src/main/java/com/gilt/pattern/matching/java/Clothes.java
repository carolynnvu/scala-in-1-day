package com.gilt.pattern.matching.java;

public class Clothes implements Visitable {
    private int price;

    public Clothes(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
