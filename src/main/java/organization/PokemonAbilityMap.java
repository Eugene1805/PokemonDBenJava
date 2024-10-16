package organization;

public class PokemonAbilityMap implements java.io.Serializable {
    private Pokemon pokemon;
    private PokemonAbility ability;

    public PokemonAbilityMap() {}

    public PokemonAbilityMap(Pokemon pokemon, PokemonAbility ability) {
        this.pokemon = pokemon;
        this.ability = ability;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public PokemonAbility getAbility() {
        return ability;
    }

    public void setAbility(PokemonAbility ability) {
        this.ability = ability;
    }
}
