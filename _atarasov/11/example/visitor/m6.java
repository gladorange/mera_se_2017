package example.visitor;

import java.util.ArrayList;
import java.util.List;

public class m6 {

    public static void main(String[] args) {

        List<SaleItem> l = new ArrayList<>();
        l.add(new Book("Мертвые души", 100500));
        l.add(new Book("Гарри Поттера", 1000));
        l.add(new Book("Отцы и Деты", 100));

        l.add(new Painting("Девятый вал", 1874));

        PriceVisitor v = new PriceVisitor();

        for (SaleItem saleItem : l) {
            if (saleItem instanceof Book) {
                v.visitBook((Book) saleItem);
            } else if (saleItem instanceof Painting) {
                v.visitPainting((Painting) saleItem);
            }
        }

        System.out.println("А теперь по-другому");
        for (SaleItem saleItem : l) {
            saleItem.accept(v);
        }
    }

    public static class PriceVisitor {
        public void visitBook(Book b) {
            System.out.println("Цена на " + b.name + " равна " + b.countPages * b.name.length());
        }

        public void visitPainting(Painting b) {
            System.out.println("Цена на " + b.name + " равна " + b.year * b.name.length());

        }
    }

}
