package vitor.joao.maratonajava.javacore.Cadvanced.ecrud.repository;


import vitor.joao.maratonajava.javacore.Cadvanced.ecrud.conn.ConnectionFactory;
import vitor.joao.maratonajava.javacore.Cadvanced.ecrud.domain.Anime;
import vitor.joao.maratonajava.javacore.Cadvanced.ecrud.domain.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AnimeRepository {

    public static List<Anime> findByName(String name) {
        System.out.println("Finding Anime by name");
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.ProducerBuilder.builder()
                        .name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id"))
                        .build();
                Anime anime = Anime.AnimeBuilder.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return animes;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name AS 'producer_name'
                                FROM anime_store.anime AS a
                                INNER JOIN anime_store.producer AS p
                                ON a.producer_id = p.id
                                WHERE a.name LIKE ?;
                 """;
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
        String sql = "DELETE FROM anime WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime anime) {
        System.out.printf("Saving anime %s", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStamentSave(conn, anime)) {
            boolean execute = ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStamentSave(Connection conn, Anime anime) throws SQLException {
        String sql = "INSERT INTO anime (name, episodes, producer_id) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId());
        return ps;
    }

    public static Optional<Anime> findById(Integer id) {
        System.out.println("Finding Anime by id");
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            Producer producer = Producer.ProducerBuilder.builder()
                    .name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_id"))
                    .build();
            Anime anime = Anime.AnimeBuilder.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();
            return Optional.of(anime);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
                 SELECT a.id, a.name, a.episodes, a.producer_id, p.name AS 'producer_name'
                               FROM anime_store.anime AS a
                               INNER JOIN anime_store.producer AS p
                               ON a.producer_id = p.id
                               WHERE a.id = ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id); // modo antigo (1, "%" + name + "%");
        return ps;
    }

    public static void update(Anime anime) {
        System.out.printf("Updating anime %s ", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementUpdate(conn, anime)) {
            boolean execute = ps.execute();
            System.out.println(execute);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPrepareStatementUpdate(Connection conn, Anime anime) throws SQLException {
        String sql = "UPDATE anime SET name = ?, episodes = ? WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
