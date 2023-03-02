package dk.javahandson.BE;

import java.util.Date;

public class Book {

    private int id;
    private String title;
    private String forfatter;
    private String forlag;
    private String isbn;
    private int rating;
    private Date laestDato;
    private Date udlaantDate;

    public Book(int id, String title, String forfatter, String forlag, String isbn, int rating, Date laestDato, Date udlaantDate){
        this.id = id;
        this.title = title;
        this.forfatter = forfatter;
        this.forlag=forlag;
        this.isbn=isbn;
        this.rating=rating;
        this.laestDato=laestDato;
        this.udlaantDate=udlaantDate;
    }
}
