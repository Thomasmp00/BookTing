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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public String getForlag() {
        return forlag;
    }

    public void setForlag(String forlag) {
        this.forlag = forlag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getLaestDato() {
        return laestDato;
    }

    public void setLaestDato(Date laestDato) {
        this.laestDato = laestDato;
    }

    public Date getUdlaantDate() {
        return udlaantDate;
    }

    public void setUdlaantDate(Date udlaantDate) {
        this.udlaantDate = udlaantDate;
    }
    
}
