package br.edu.unifei.ecot12.trabalho.pokemon;

public abstract class Character {
	private String name;
	private int age;
	private boolean pokemon;
	private String sex;
	private Location location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isPokemon() {
		return pokemon;
	}
	public void setPokemon(boolean pokemon) {
		this.pokemon = pokemon;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
