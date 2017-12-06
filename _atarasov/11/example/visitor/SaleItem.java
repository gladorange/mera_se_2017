package example.visitor;

import example.visitor.m6.PriceVisitor;

public abstract class SaleItem {

    String name;

    public SaleItem(String name) {
        this.name = name;
    }

    public abstract void accept(PriceVisitor v);
}
