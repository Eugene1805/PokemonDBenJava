package dao;

import model.Pokemon;

import java.sql.SQLException;
import java.util.List;

public interface PokemonDAO {
    public void createPokemon(Pokemon pokemon) throws SQLException;
    public Pokemon readPokemon(int id) throws SQLException;
    public void updatePokemon(Pokemon pokemon) throws SQLException;
    public void deletePokemon(Pokemon pokemon) throws SQLException;
    public List<Pokemon> getAllPokemons() throws SQLException;
}
