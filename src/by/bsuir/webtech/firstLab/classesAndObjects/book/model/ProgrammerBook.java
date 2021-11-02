package by.bsuir.webtech.firstLab.classesAndObjects.book.model;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        ProgrammerBook book = (ProgrammerBook) obj;
        return Objects.equals(language, book.language) && level == book.level;
    }

    @Override
    public int hashCode() {
        int result = 0;
        String str = getTitle() + getAuthor() + getLanguage();
        for (char c : str.toCharArray()) {
            result += c;
        }
        return result * getPrice() * getLevel();
    }

    @Override
    public String toString() {
        return "Programmer book {" +
                "\n  title: '" + getTitle() + "'," +
                "\n  author: '" + getAuthor() + "'," +
                "\n  language: '" + language + "'," +
                "\n  level: '" + level + "'," +
                "\n  price: " + getPrice() + "'," +
                "\n  edition: '" + getEdition() + "'," +
                "\n}";
    }
}
