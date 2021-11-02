package by.bsuir.webtech.firstLab.classesAndObjects.book.model;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {
    private static int edition;
    private String title;
    private String author;
    private int price;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return (price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author));
    }

    @Override
    public int hashCode() {
        int result = 0;
        String str = title + author;
        for (char c : str.toCharArray()) {
            result += c;
        }
        return result * price * price;
    }

    @Override
    public String toString() {
        return "Book {" +
                "\n  title: '" + title + "'," +
                "\n  author: '" + author + "'," +
                "\n  price: " + price + "'," +
                "\n  edition: '" + edition + "'," +
                "\n}";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(isbn, book.isbn);
    }
}
