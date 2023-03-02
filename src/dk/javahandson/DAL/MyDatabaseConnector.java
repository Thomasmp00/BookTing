package dk.javahandson.DAL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class MyDatabaseConnector {

    private SQLServerDataSource dataSource;

    public MyDatabaseConnector() {
        dataSource = new SQLServerDataSource();
        dataSource.setServerName("10.176.111.31");
        dataSource.setDatabaseName("Books1234");
        dataSource.setUser("CSe22A_37");
        dataSource.setPassword("CSe22A_37");
        dataSource.setTrustServerCertificate(true);
        //  dataSource.setPortNumber(1433);

    }

    public Connection getConnection() throws SQLException
    {
        return dataSource.getConnection();


    }
    public static void main(String[] args) throws SQLException {
        MyDatabaseConnector databaseConnector = new MyDatabaseConnector();
        try (Connection connection = databaseConnector.getConnection();)
        {
            System.out.println("Is it open " + !connection.isClosed());
        }




    }






}
