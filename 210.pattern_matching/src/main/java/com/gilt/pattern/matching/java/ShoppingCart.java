package com.gilt.pattern.matching.java;

import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    public Set<Visitable> items = new HashSet<Visitable>();

    public double computeTax() {
        TaxVisitor visitor = new TaxVisitor();
        for (Visitable item : items) {
            item.accept(visitor);
        }
        return visitor.getTotalTax();
    }
}
