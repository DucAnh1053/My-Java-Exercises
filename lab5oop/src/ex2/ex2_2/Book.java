package ex2.ex2_2;

import ex2.ex2_1.Author;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty + '}';
    }

    public String getAuthorNames() {
        StringBuilder authorsStr = new StringBuilder();
        for (Author author : authors) {
            authorsStr.append(author).append(", ");
        }
        authorsStr.delete(authorsStr.length() - 2, authorsStr.length());
        return authorsStr.toString();
    }
}
