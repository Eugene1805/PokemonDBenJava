package dao;

import model.PokemonType;

import java.sql.SQLException;
import java.util.List;

public interface PokemonTypeDAO {

    public void create(PokemonType pokemonType) throws SQLException, ClassNotFoundException;
    public PokemonType read(int id) throws SQLException, ClassNotFoundException;
    public void update(PokemonType pokemonType) throws SQLException, ClassNotFoundException;
    public void delete(int id) throws SQLException, ClassNotFoundException;
    public List<PokemonType> readAll() throws SQLException, ClassNotFoundException;
}
