package br.edu.unifei.ecot12.trabalho.pokemon;

public class Free implements LifeStyle {

    private String location;
    private float rarity;

    public void swap(Pokemon pokemon) {
    	if(pokemon.isOwner()==true)
            pokemon.setLifeStyle(new Caught());
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getRarity() {
        return rarity;
    }

    public void setRarity(float rarity) {
        this.rarity = rarity;
    }
}
