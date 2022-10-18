package fr.lixtec.form10.j2.tp7;

public class Produit {
	
	private String code;
	private String id;
	private String libelle;
	private String descritpion;
	
	Produit(String code, String id, String lib, String desc){
		this.code = code;
		this.id =id;
		this.libelle = lib;
		this.descritpion=desc;
	}
	
	public String getCode() {
		return this.code;	
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getLibelle() {
		return this.libelle;
	}
	
	public String getDescritpion() {
		return this.descritpion;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setId(String id) {
		this.id = id;
		
	}
	
	public void setLibelle(String lib) {
		this.libelle = lib;
		
	}
	
	public void setDescription(String desc) {
		this.descritpion = desc;
		
	}
}
