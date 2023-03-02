package dk.javahandson.BLL;

import dk.javahandson.BE.Book;

import java.util.Date;
import java.util.List;

public class BookManager {

    public List<Book> getAllBooks() throws Exception {
        return bookDAO_DB.getAllBooks;
    }

    public Book createBook(String title, String forfatter, String forlag, String isbn, int rating, Date laestDato, Date udlaantDate){
        return bookDAO_DB.createBook(title, forfatter, forlag, isbn, rating, laestDato, udlaantDate);
    }

}
