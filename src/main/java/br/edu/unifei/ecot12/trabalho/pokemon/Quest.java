package br.edu.unifei.ecot12.trabalho.pokemon;

public class Quest extends NPC {
	private String reward;
	private String challenge;
	private int difficulty;
	public void giveQuest(int TypeQuest) {
		if(TypeQuest==1) {
			System.out.println("\nNew quest unlocked: defeat the gym\n");
		}
		else if(TypeQuest==2) {
			System.out.println("\nNew quest unlocked: defeat your rival\n");
		}
		else if(TypeQuest==3) {
			System.out.println("\nNew quest unlocked: defeat wild pokemon\n");
		}
		else {
			System.out.println("\nNew quest unlocked: catch pokemon\n");
		}
	}
	
	public String getReward() {
		return reward;
	}
	public void setReward(String reward) {
		this.reward = reward;
	}
	public String getChallenge() {
		return challenge;
	}
	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
}
