package gui.Model;

import dk.javahandson.BE.Book;
import dk.javahandson.BLL.BookManager;
import javafx.collections.ObservableList;

public class BookModel {
    BookManager bookManager;
    private ObservableList<Book> booksToBeViewed;
}
