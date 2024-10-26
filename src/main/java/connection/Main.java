package connection;

import dao.PokemonTypeDAO;
import dao.PokemonTypeDAOImp;
import model.PokemonType;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            PokemonTypeDAO typeDAO= new PokemonTypeDAOImp();
            List<PokemonType> types = typeDAO.readAll();
            for(PokemonType type : types){
                System.out.println(type.getTypeName());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
