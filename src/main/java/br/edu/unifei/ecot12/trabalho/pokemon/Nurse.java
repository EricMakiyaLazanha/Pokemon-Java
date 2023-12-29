package br.edu.unifei.ecot12.trabalho.pokemon;

public class Nurse extends NPC {
	private boolean tradePC;
	public void heal(Pokemon pokemon) {
		pokemon.setHp(pokemon.getMaxHp());
		System.out.println("Nurse " + getName() +" healed " + pokemon.getName());
	}
	
	public boolean isTradePC() {
		return tradePC;
	}
	public void setTradePC(boolean tradePC) {
		this.tradePC = tradePC;
	}
}	
