package example.visitor;

import example.visitor.m6.PriceVisitor;

public class Book extends SaleItem{
    Integer countPages;

    public Book(String name, Integer countPages) {
        super(name);
        this.countPages = countPages;
    }

    @Override
    public void accept(PriceVisitor v) {
        v.visitBook(this);
    }
}
