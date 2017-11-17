package top;

import java.util.Arrays;

public class Author extends Person{
    Book[] children;

    public Author(Book[] childred) {
        super("Noname");
        for (Book book : childred) {
            book.setA(this);
        }
        this.children = childred;
    }

    public Book[] getChildren() {
        return children;
    }

    public void setChildren(Book[] children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Author{" + "children=" + Arrays.toString(children) + '}';
    }
}




