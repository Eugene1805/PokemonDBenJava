package model;

public class PokemonType implements java.io.Serializable {
    private int id;
    private String typeName;

    public PokemonType() {}

    public PokemonType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
