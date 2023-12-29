package br.edu.unifei.ecot12.trabalho.pokemon;

public class Seller extends NPC {
	private String storeSize;
	private String popularity;
	private int numIntens;
	private Itens itens;
	
	public String getStoreSize() {
		return storeSize;
	}
	public void setStoreSize(String storeSize) {
		this.storeSize = storeSize;
	}
	public String getPopularity() {
		return popularity;
	}
	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}
	public int getNumIntens() {
		return numIntens;
	}
	public void setNumIntens(int numIntens) {
		this.numIntens = numIntens;
	}
	public Itens getItens() {
		return itens;
	}
	public void setItens(Itens itens) {
		this.itens = itens;
	}
	
}
