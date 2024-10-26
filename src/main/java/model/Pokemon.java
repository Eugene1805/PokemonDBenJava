package model;

import java.io.Serializable;

public class Pokemon implements Serializable {
    private int id;
    private String name;
    private float height;
    private int weight;
    private int baseExperience;
    private PokemonType type;

    public Pokemon() {}

    public Pokemon(String name, float height, int weight, int baseExperience) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }
}
