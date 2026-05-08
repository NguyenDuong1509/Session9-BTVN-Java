package Ss9Rikke;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    String author;
    Double price;

    public Book() {
    }

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void printInfo(){
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.printf("Giá tiền: %.2f%n", price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java", "James", 100.0);
        Book book2 = new Book("Python", "Guido", 120.0);
        Book book3 = new Book("C++", "Bjarne", 150.0);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println("Danh sách sách là:");
        for(Book b : books) {
            b.printInfo();
        }
    }

}
