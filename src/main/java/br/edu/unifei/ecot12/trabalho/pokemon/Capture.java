package br.edu.unifei.ecot12.trabalho.pokemon;

public class Capture implements BattleAction {
	private Pokemon pokemon;
	public Capture(Pokemon pokemon) {
		super();
		this.pokemon = pokemon;
	}
	public void performAction() {
		pokemon.capture();
	}
	public Pokemon getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	

}