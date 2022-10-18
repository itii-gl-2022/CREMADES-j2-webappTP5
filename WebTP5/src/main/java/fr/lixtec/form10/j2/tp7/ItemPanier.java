package fr.lixtec.form10.j2.tp7;

public class ItemPanier {

	private Produit produit;
	private int quantite;

	public ItemPanier(Produit produit, int quantite) {
		this.produit = produit;
		this.quantite = quantite;
	}

	public Produit getProduct() {
		return produit;
	}

	public void setProduct(Produit produit) {
		this.produit = produit;
	}

	public int getQuantity() {
		return quantite;
	}

	public void setQuantity(int quantite) {
		this.quantite = quantite;
	}

}