package entity;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String name;
    List<Book> books = new ArrayList<>(5);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() { // hard code
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        Book book;
        for (int i = 1; i <= 10; i++) {
            book = new Book();
            book.setId(i);
            book.setName("Book: " + i);
            books.add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setName(name);
        for (Book book : this.getBooks()) {
            bookShop.getBooks().add(book);
        }
        return bookShop;
    }
}
