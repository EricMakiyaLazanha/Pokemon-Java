package br.edu.unifei.ecot12.trabalho.pokemon;

public class Attack implements BattleAction {
	private Pokemon pokemon;
	public Attack(Pokemon pokemon) {
		super();
		this.pokemon = pokemon;
	}
	public void performAction() {
		pokemon.attack();
	}
	public Pokemon getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

}
