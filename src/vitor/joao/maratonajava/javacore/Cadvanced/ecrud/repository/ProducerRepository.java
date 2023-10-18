package vitor.joao.maratonajava.javacore.Cadvanced.ecrud.repository;


import vitor.joao.maratonajava.javacore.Cadvanced.ecrud.conn.ConnectionFactory;
import vitor.joao.maratonajava.javacore.Cadvanced.ecrud.domain.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProducerRepository {

    public static List<Producer> findByName(String name) {
        System.out.println("Finding Producer by name");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
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

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM producer WHERE name LIKE ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name)); // modo antigo (1, "%" + name + "%");
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn, id)) {
            boolean execute = ps.execute();
            System.out.println(execute);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM producer WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        System.out.printf("Saving producer %s", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStamentSave(conn, producer)) {
            boolean execute = ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStamentSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO producer (name) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static Optional<Producer> findById(Integer id) {
        System.out.println("Finding Producer by id");
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            return Optional.of(Producer.ProducerBuilder.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM producer WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id); // modo antigo (1, "%" + name + "%");
        return ps;
    }

    public static void update(Producer producer) {
        System.out.printf("Updating producer %s ", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementUpdate(conn, producer)) {
            boolean execute = ps.execute();
            System.out.println(execute);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE producer SET name = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }
}
