package br.edu.unifei.ecot12.trabalho.pokemon;

public class Run implements BattleAction {
	private Pokemon pokemon;
	public Run(Pokemon pokemon) {
		super();
		this.pokemon = pokemon;
	}
	public void performAction() {
		pokemon.run();
	}
	public Pokemon getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

}