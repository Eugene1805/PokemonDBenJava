package dao;

import connection.DatabaseConnection;
import model.Pokemon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PokemonDAOImp implements PokemonDAO {

    private String tableName;

    public PokemonDAOImp() {
        tableName = "Pokemon";
    }
    @Override
    public void createPokemon(Pokemon pokemon) throws SQLException {
      /*  try {
            Connection con = DatabaseConnection.getInstance().getConnection();
            String insertQuery = "INSERT INTO " + tableName + "(type_name) VALUES (?)";
            PreparedStatement stmt = con.prepareStatement(insertQuery);
            stmt.setString(1, Pokemon.getTypeName());
            stmt.execute();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/
    }

    @Override
    public Pokemon readPokemon(int id) throws SQLException {
        return null;
    }

    @Override
    public void updatePokemon(Pokemon pokemon) throws SQLException {

    }

    @Override
    public void deletePokemon(Pokemon pokemon) throws SQLException {

    }

    @Override
    public List<Pokemon> getAllPokemons() throws SQLException {
        return List.of();
    }
}
