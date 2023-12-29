package br.edu.unifei.ecot12.trabalho.pokemon;
import java.util.ArrayList;
import java.util.List;

public class Player extends Character {
	private int numPokemon;
	private int badges;
	private int money;
	private Pokemon pokemon;
	private BattleAction battleAction;
	private Backpack backpack;
	private List<Pokemon> pokemonList = new ArrayList<>();
	
	public void addPokemon(Pokemon pokemon){
        pokemonList.add(pokemon);
        setNumPokemon(pokemonList.size());
    }
    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }
	public void addNumPokemon() {
		numPokemon++;
	}
	
	public int getNumPokemon() {
		return numPokemon;
	}
	public void setNumPokemon(int numPokemon) {
		this.numPokemon = numPokemon;
	}
	public int getBadges() {
		return badges;
	}
	public void setBadges(int badges) {
		this.badges = badges;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Pokemon getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	public BattleAction getBattleAction() {
		return battleAction;
	}
	public void setBattleAction(BattleAction battleAction) {
		this.battleAction = battleAction;
	}
	public Backpack getBackpack() {
		return backpack;
	}
	public void setBackpack(Backpack backpack) {
		this.backpack = backpack;
	}
	
}
