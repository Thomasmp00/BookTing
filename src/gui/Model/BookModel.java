package gui.Model;

import dk.javahandson.BE.Book;
import dk.javahandson.BLL.BookManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BookModel {
    BookManager bookManager;
    private ObservableList<Book> booksToBeViewed;

    public BookModel() throws Exception{
        bookManager = new BookManager();
        booksToBeViewed = FXCollections.observableArrayList();
        booksToBeViewed.addAll(bookManager.getAllBooks());
    }
}
