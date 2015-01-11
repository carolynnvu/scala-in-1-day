package com.gilt.pattern.matching.java;

public class TaxVisitor implements Visitor {

    double totalTax;

    @Override
    public void visit(Book book) {
        totalTax += book.getPrice() * 0.05;
    }

    @Override
    public void visit(Clothes clothes) {
        totalTax += clothes.getPrice() * 0.08;
    }

    @Override
    public void visit(Food food) {
        totalTax += food.getPrice() * 0.09;
    }

    public double getTotalTax() {
        return totalTax;
    }

}

