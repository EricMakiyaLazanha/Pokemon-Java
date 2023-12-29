package br.edu.unifei.ecot12.trabalho.pokemon;

public class Caught implements LifeStyle {

	public int individualValues;
	public float hapinnes;
	public float expBar;
	public String trainer;
	
	public void swap(Pokemon pokemon) {
		if(pokemon.isOwner()==false)
	        pokemon.setLifeStyle(new Free());
	}
	public int getIndividualValues() {
		return individualValues;
	}
	public void setIndividualValues(int individualValues) {
		this.individualValues = individualValues;
	}
	public float getHapinnes() {
		return hapinnes;
	}
	public void setHapinnes(float hapinnes) {
		this.hapinnes = hapinnes;
	}
	public float getExpBar() {
		return expBar;
	}
	public void setExpBar(float expBar) {
		this.expBar = expBar;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
}
