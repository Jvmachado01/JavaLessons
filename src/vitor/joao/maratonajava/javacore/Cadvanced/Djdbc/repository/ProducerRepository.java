package vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.repository;

import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.conn.ConnectionFactory;
import vitor.joao.maratonajava.javacore.Cadvanced.Djdbc.domain.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ProducerRepository {

    public static void save(Producer producer) {
        String sql = String.format("INSERT INTO producer (name) VALUES ('%s');", producer.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id) {
        String sql = String.format("DELETE FROM producer WHERE id = '%d';", id);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void update(Producer producer) {
        String sql = String.format("UPDATE producer SET name = '%s' WHERE id = '%d'", producer.getName(), producer.getId());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findAll() {
        System.out.println("Finding all Producers");

        String sql = String.format("SELECT id, name FROM producer;");
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                // Forma curta:
                Producer producer = Producer.ProducerBuilder.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);

                // Forma longa:
//                var  id = rs.getInt("id");
//                var name = rs.getString("name");
//                Producer producer = Producer.ProducerBuilder.builder()
//                .id(id)
//                .name(name)
//                .build();
//                producers.add(producer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producers;
    }

    public static List<Producer> findByName(String name) {
        System.out.println("Finding Producer by name");
        String sql = String.format("SELECT * FROM producer WHERE name LIKE '%%%s%%';", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = Producer.ProducerBuilder.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producers;
    }

    public static void showProducerMetaData() {
        System.out.println("Showing Producer metadata");
        String sql = String.format("SELECT * FROM producer ;");
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            System.out.println("columnCount: " + columnCount);
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Table name: " + rsMetaData.getTableName(i));
                System.out.println("Column name: " + rsMetaData.getColumnName(i));
                System.out.println("Column size: " + rsMetaData.getColumnDisplaySize(i));
                System.out.println("Column type name: " + rsMetaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void showDriverMetaData() {
        System.out.println("Showing Driver metadata");
        String sql = String.format("SELECT * FROM producer ;");
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData dbMetaData = conn.getMetaData();

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Supports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("And supports CONCUR_UPDATABLE");

                }
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("And supports CONCUR_UPDATABLE");

                }
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Supports TYPE_SCROLL_SENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("And supports CONCUR_UPDATABLE");

                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void showTypeScrollWorking() {
        String sql = String.format("SELECT * FROM producer;");
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("Last row? " + rs.last());
            System.out.println("Row number: " + rs.getRow());
            System.out.println(Producer.ProducerBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            System.out.println("First row? " + rs.first());
            System.out.println("Row number: " + rs.getRow());
            System.out.println(Producer.ProducerBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            System.out.println("First absolute? " + rs.absolute(2));
            System.out.println("Row number: " + rs.getRow());
            System.out.println(Producer.ProducerBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            System.out.println("First relative? " + rs.relative(-1));
            System.out.println("Row number: " + rs.getRow());
            System.out.println(Producer.ProducerBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            System.out.println("Is last? " + rs.isLast());
            System.out.println("Row number: " + rs.getRow());

            System.out.println("Is first? " + rs.isFirst());
            System.out.println("Row number: " + rs.getRow());

            System.out.println("Last row" + rs.last());
            System.out.println("--------------------------------");
            rs.next();
            System.out.println("After last row? " + rs.isAfterLast());
            while (rs.previous()) {
                System.out.println(Producer.ProducerBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        System.out.println("Finding Producer by name - uppercase");
        String sql = String.format("SELECT * FROM producer WHERE name LIKE '%%%s%%';", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
//                rs.cancelRowUpdates();
                rs.updateRow();

                Producer producer = Producer.ProducerBuilder.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        System.out.println("Finding Producer by name (Insert when not found)");
        String sql = String.format("SELECT * FROM producer WHERE name LIKE '%%%s%%';", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) return producers;

            rs.moveToInsertRow();
            rs.updateString("name", name);
            rs.insertRow();

            rs.beforeFirst();
            rs.next();
            Producer producer = Producer.ProducerBuilder.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build();

            producers.add(producer);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producers;
    }

    public static void findByNameAndDelete(String name) {
        String sql = String.format("SELECT * FROM producer WHERE name LIKE '%%%s%%';", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Finding Producer by name and delete row" + rs.getString("name"));
                rs.deleteRow();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        System.out.println("Finding Producer by name");

        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {


            while (rs.next()) {
                Producer producer = Producer.ProducerBuilder.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producers;
    }

    public static void updatePreparedStatement(Producer producer) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findByNameCallableStatement(String name) {
        System.out.println("Finding Producer by name (Callable Statement)");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = callableStatementUpdate(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.ProducerBuilder.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producers;
    }

    public static void saveTransaction(List<Producer> producers)  {
        try (Connection conn = ConnectionFactory.getConnection()) {
            conn.setAutoCommit(false);
            preparedStatementSaveTransaction(conn, producers);
            conn.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createdPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM producer WHERE name LIKE ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name)); // modo antigo (1, "%" + name + "%");
        return ps;
    }

    private static PreparedStatement preparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE producer SET name = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

    private static CallableStatement callableStatementUpdate(Connection conn, String name) throws SQLException {
        String sql = "CALL sp_get_producer_by_name(?);";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1, String.format("%%%s%%", name));
        return cs;
    }

    private static void preparedStatementSaveTransaction(Connection conn, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO producer (name) VALUES (?);";
        boolean shouldRollBack = false;
        for (Producer p : producers) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                System.out.printf("Saving producer :%s%n", p.getName());
                ps.setString(1, p.getName());
//                if (p.getName().equals("White Fox")) throw new SQLException("Can't save White Fox");
                ps.execute();
            } catch (SQLException e) {
                shouldRollBack = true;
                throw  new RuntimeException(e);
            }
        }

        if (shouldRollBack) {
            System.out.println("Transaction is going be rollback");
            conn.rollback();
        }
    }
}
