package by.bsuir.webtech.firstLab.classesAndObjects.book.comparator;

import by.bsuir.webtech.firstLab.classesAndObjects.book.model.Book;

import java.util.Comparator;

public class BookComparator {
    public static Comparator<Book> compareByTitle = (book1, book2)
            -> book1.getTitle().compareToIgnoreCase(book2.getTitle());

    public static Comparator<Book> compareByAuthor = (book1, book2)
            -> book1.getAuthor().compareToIgnoreCase(book2.getAuthor());

    public static Comparator<Book> byPrice = Comparator.comparingInt(Book::getPrice);

    public static Comparator<Book> compareByTitleThanAuthor = compareByTitle.thenComparing(compareByAuthor);

    public static Comparator<Book> compareByAuthorThanTitle = compareByAuthor.thenComparing(compareByTitle);

    public static Comparator<Book> compareByAuthorThanTitleThanPrice = compareByAuthor
            .thenComparing(compareByTitle).thenComparing(byPrice);
}
