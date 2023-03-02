package dk.javahandson.DAL;

import dk.javahandson.BE.Book;

import java.sql.*;
import java.util.Date;

public class BookDAO_DB {
    private MyDatabaseConnector dataBaseConnecter;

    private BookDAO_DB() throws SQLException {dataBaseConnecter = new MyDatabaseConnector();}

    public Book createBook(String title, String forfatter, String forlag, String isbn, int rating, Date laestDato, Date udlaantDate) throws Exception {

        String sql = "INSERT INTO Book (Title, forfatter, forlag, isbn, rating, leastDato, udlaantDate) VALUES (?,?,?,?,?,?,?);";
        try (Connection conn = dataBaseConnecter.getConnection()) {
        PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        pstmt.setString(1, title);
        pstmt.setString(2, forfatter);
        pstmt.setString(3, forlag);
        pstmt.setString(4, isbn);
        pstmt.setInt(5, rating);
        pstmt.setDate(6, (java.sql.Date) laestDato);
        pstmt.setDate(7, (java.sql.Date) udlaantDate);

        pstmt.executeUpdate();

        ResultSet rs = pstmt.getGeneratedKeys();
        int id = 0;

        if (rs.next()) {
            id = rs.getInt(1);


        }
        Book book = new Book(id, title, forfatter, forlag, isbn, rating, laestDato, udlaantDate);
        return book;
    } catch (SQLException ex){
            ex.printStackTrace();
            throw new Exception("Could not create movie",ex);
    }

}}
