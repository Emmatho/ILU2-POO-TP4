package produit;

public class Poisson extends Produit {
	
	private String nom = "poisson";
	private String date = "";
	
	public Poisson(String date) {
		super("poisson", "kg");
		this.date = date;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getDate() {
		return date;
	}

}
