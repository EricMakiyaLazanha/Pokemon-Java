package br.edu.unifei.ecot12.trabalho.pokemon;

public class Pokemon {
	private TypeEnum type;
	private int level;
	private String sex;
	private int hp;
	private int evolution;
	private boolean owner;
	private int maxHp;
	private boolean careful;
	private String name;
	private LifeStyle lifeStyle = new Free();
	public void change() {
		lifeStyle.swap(this);
	}
	public void run() {
		careful = false;
		System.out.println("You ran from the pokemon \n");
	}
	public void attack() {
		if(hp > 0.25*maxHp) {
			level = level+1;
			hp = (int) (hp - maxHp*0.10);
			maxHp = (int) (maxHp + maxHp*0.1);
			System.out.println(getName() + " defeated a pokemon \n");
			if(level==evolution) {
				maxHp = (int) (maxHp*1.5);
				System.out.println(getName() +" evolved \n");
			}
		}
		else{
			hp = 0;
			System.out.println(getName() + " lost the battle\n");
		}
	}
	public void challenge(Pokemon p) {
		if(p.getLevel()>= getLevel()) {
			setHp(0);
			System.out.println("\nYou win! " + p.getName() + 
					" defeated " + getName());
		}
		else {
			System.out.println("\nYou loose!" + p.getName() + 
					" was defeated by " + getName());
			p.setHp(0);
			p.setLevel(p.getLevel()+1);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void capture() {
		owner = true;
		change();
	}
	public TypeEnum getType() {
		return type;
	}
	public void setType(TypeEnum type) {
		this.type = type;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getEvolution() {
		return evolution;
	}
	public void setEvolution(int evolution) {
		this.evolution = evolution;
	}
	public boolean isOwner() {
		return owner;
	}
	public void setOwner(boolean owner) {
		this.owner = owner;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public boolean isCareful() {
		return careful;
	}
	public void setCareful(boolean careful) {
		this.careful = careful;
	}
	public LifeStyle getLifeStyle() {
		return lifeStyle;
	}
	public void setLifeStyle(LifeStyle lifeStyle) {
		this.lifeStyle = lifeStyle;
	}
	
}
