package organization;

public class PokemonType implements java.io.Serializable {
    private int id;
    private String name;

    public PokemonType() {}

    public PokemonType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
