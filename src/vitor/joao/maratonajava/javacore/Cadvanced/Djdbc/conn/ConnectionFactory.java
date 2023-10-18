package vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
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

    public static JdbcRowSet getJdbcRowSet() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/anime_store";
        String username = "root";
        String password = "sprt@#3382";

        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(username);
        jdbcRowSet.setPassword(password);
        return jdbcRowSet;
    }

    public static CachedRowSet getCachedRowSet() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/anime_store";
        String username = "root";
        String password = "sprt@#3382";

        CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
        cachedRowSet.setUrl(url);
        cachedRowSet.setUsername(username);
        cachedRowSet.setPassword(password);
        return cachedRowSet;
    }
}
