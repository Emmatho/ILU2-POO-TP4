package produit;

public class Produit {
	private String nom;
	private String unite;
	
	public Produit(String nomProd, String uniteProd) {
		nom = nomProd;
		unite = uniteProd;
	}
	
	public String getNomProduit() {
		return nom;
	}
	
	public String description() {
		if (nom == "poisson") {
			return nom + " péchés ";
		}
		return this.nom + " se compte en " + this.unite;
	}
}
