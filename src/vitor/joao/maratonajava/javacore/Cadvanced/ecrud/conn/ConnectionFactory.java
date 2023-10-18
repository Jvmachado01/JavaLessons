package vitor.joao.maratonajava.javacore.Cadvanced.ecrud.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // java.sql = Connection, Statement, ResultSet, DriverManager
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/anime_store";
        String username = "root";
        String password = "sprt@#3382";

        return DriverManager.getConnection(url, username, password);
    }
}
