package dao;

import connection.DatabaseConnection;
import model.PokemonType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PokemonTypeDAOImp implements PokemonTypeDAO {

    private String tableName;

    public PokemonTypeDAOImp() {
        tableName = "PokemonType";
    }

    @Override
    public void create(PokemonType pokemonType) throws SQLException, ClassNotFoundException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        String query = "INSERT INTO " + tableName + "(type_name) VALUES (?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, pokemonType.getTypeName());
        ps.execute();
    }

    @Override
    public PokemonType read(int id) throws SQLException, ClassNotFoundException {
            Connection conn = DatabaseConnection.getInstance().getConnection();
            String query = "SELECT id, type_name FROM " + tableName + " WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            PokemonType pokemonType = new PokemonType();
            if (rs.next()) {
                pokemonType.setId(rs.getInt(1));
                pokemonType.setTypeName(rs.getString(2));
            }
        return pokemonType;
    }

    @Override
    public void update(PokemonType pokemonType) throws SQLException, ClassNotFoundException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        String query = "UPDATE "+tableName+" SET type_name = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, pokemonType.getTypeName());
        ps.setInt(2, pokemonType.getId());
        ps.executeUpdate();
    }

    @Override
    public void delete(int id) throws SQLException, ClassNotFoundException {
        Connection conn = DatabaseConnection.getInstance().getConnection();
        String query = "DELETE FROM "+tableName+" WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public List<PokemonType> readAll() throws SQLException, ClassNotFoundException {
        List<PokemonType> pokemonTypes = new ArrayList<PokemonType>();
        Connection conn = DatabaseConnection.getInstance().getConnection();
        String selectQuery = "SELECT id, type_name FROM " + tableName;
        PreparedStatement stmt = conn.prepareStatement(selectQuery);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            PokemonType pokemonType = new PokemonType();
            pokemonType.setId(rs.getInt(1));
            pokemonType.setTypeName(rs.getString(2));
            pokemonTypes.add( pokemonType );
        }
        return pokemonTypes;
    }
}
