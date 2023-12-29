package br.edu.unifei.ecot12.trabalho.pokemon;

public class Trainer extends NPC {
	private int numPokemon;
	private int money;
	private TypeEnum type;
	private Pokemon pokemon;

	public int getNumPokemon() {
		return numPokemon;
	}
	public void setNumPokemon(int numPokemon) {
		this.numPokemon = numPokemon;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public TypeEnum getType() {
		return type;
	}
	public void setType(TypeEnum i) {
		this.type = i;
	}
	public Pokemon getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
}
