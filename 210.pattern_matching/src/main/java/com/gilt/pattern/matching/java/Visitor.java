package com.gilt.pattern.matching.java;

public interface Visitor {
    public void visit(Book book);

    public void visit(Clothes clothes);

    public void visit(Food food);
}
