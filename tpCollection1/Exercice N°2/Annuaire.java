package atelier1_2;

import java.util.HashMap;
import java.util.Map;

public class Annuaire {
	 private Map<String, Fiche> tab;

	    public Annuaire() {
	        this.tab = new HashMap<>();
	    }

	    public void ajouterFiche(String nom, String numero, String adresse) {
	        Fiche nouvelleFiche = new Fiche(nom, numero, adresse);
	        tab.put(nom, nouvelleFiche);
	    }

	    public Fiche rechercherFiche(String nom) {
	        return tab.get(nom);
	    }

	    public void afficherAnnuaire() {
	        for (Fiche fiche : tab.values()) {
	            System.out.println(fiche);
	        }
	    }

}
