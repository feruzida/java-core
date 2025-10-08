package lessons.lesson03.basicClasses;

public class Book {
    private final int isbn;
    private String title;
    private String author;
    private int year;
    private boolean status;

    public Book(int isbn, String title, String author, int year, boolean status) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = status;
    }

    public void getBookInfo() {
        System.out.println("Information about " + title +
                "\nISBN: " + isbn +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nYear: " + year +
                "\nStatus: " + status);
    }

    public void reserveBook() {
        status = false;
    }
}
