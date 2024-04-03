package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	
	private int poids;
	private Gaulois chasseur;
	private String nom = "sanglier";
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", "kg");
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public int getPoids() {
		return poids;
	}
	
	public String getChasseur() {
		return chasseur.getNom();
	}
	
	public String getNom() {
		return nom;
	}

}
