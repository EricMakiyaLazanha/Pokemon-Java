package br.edu.unifei.ecot12.trabalho.pokemon;

public class NPC extends Character {
	private String job;
	private boolean badGuy;
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public boolean isBadGuy() {
		return badGuy;
	}
	public void setBadGuy(boolean badGuy) {
		this.badGuy = badGuy;
	}
}
