package atelier2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Patient {
    private String nom;
    private Set<String> ordonnance;

    public Patient(String n) {
        nom = n;
        ordonnance = new HashSet<String>();
    }

    public String getNom() {
        return nom;
    }

    public boolean ordonnanceVide() {
        return ordonnance.isEmpty();
    }

    public void ajoutMedicament(String m) {
        ordonnance.add(m);
    }

    public void affiche() {
        System.out.println("Le Nom du patient : " + nom);
        System.out.println("L'Ordonnance est  : " + ordonnance);
    }

    public boolean contientMedicament(String m) {
        for (String medicament : ordonnance) {
            if (medicament.equals(m)) {
                return true;
            }
        }
        return false;
    }

    
    public void trieOrdonnance() {      
    	TreeSet<String> ordonnance_tree = new TreeSet<String>(ordonnance);
        
    }
}
