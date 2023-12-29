package br.edu.unifei.ecot12.trabalho.pokemon;

public abstract class Location {
	private boolean pokemon;
	private String preRequisit;
	private int numberNPC;
	
	public boolean isPokemon() {
		return pokemon;
	}
	public void setPokemon(boolean pokemon) {
		this.pokemon = pokemon;
	}
	public String getPreRequisit() {
		return preRequisit;
	}
	public void setPreRequisit(String preRequisit) {
		this.preRequisit = preRequisit;
	}
	public int getNumberNPC() {
		return numberNPC;
	}
	public void setNumberNPC(int numberNPC) {
		this.numberNPC = numberNPC;
	}
	
}
