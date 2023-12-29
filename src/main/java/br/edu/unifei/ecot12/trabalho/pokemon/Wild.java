package br.edu.unifei.ecot12.trabalho.pokemon;

public class Wild extends Location {
	private TypeEnum commonType;
	private int pokemonLevel;
	private int route;
	
	public TypeEnum getCommonType() {
		return commonType;
	}
	public void setCommonType(TypeEnum commonType) {
		this.commonType = commonType;
	}
	public int getPokemonLevel() {
		return pokemonLevel;
	}
	public void setPokemonLevel(int pokemonLevel) {
		this.pokemonLevel = pokemonLevel;
	}
	public int getRoute() {
		return route;
	}
	public void setRoute(int route) {
		this.route = route;
	}
	
}
