package lessons.lesson03.basicClasses;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addNewBook(Book book) {
        books.add(book);
    }

    public void getBooks() {
        for (Book book : books) {
            book.getBookInfo();
        }
    }
}
