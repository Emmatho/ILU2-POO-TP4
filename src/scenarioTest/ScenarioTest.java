package scenarioTest;

import produit.*;
import villagegaulois.*;

public class ScenarioTest {
	public static void main(String[] args) {
		
		IEtal<Produit>[] marche = new Etal[3];
		IEtal<Sanglier> etalSanglier = new Etal<>();
		IEtal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
	
	}
	
}
