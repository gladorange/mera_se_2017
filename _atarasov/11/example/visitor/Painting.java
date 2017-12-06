package example.visitor;

import example.visitor.m6.PriceVisitor;

public class Painting extends SaleItem {
    Integer year;

    public Painting(String name, Integer year) {
        super(name);
        this.year = year;
    }

    @Override
    public void accept(PriceVisitor v) {
        v.visitPainting(this);
    }
}
