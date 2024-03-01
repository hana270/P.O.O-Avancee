package atelier2;

import java.util.HashMap;

public class DossierPharmacie {
	private String nom ; 
	private HashMap <String , Patient > patients ; 
	
	public DossierPharmacie (String n){ 
		nom =n;  
		patients = new HashMap <String , Patient >(); 
} 

	 void nouveauPatient(String nom, String[] ord) {
	        Patient patient = new Patient(nom);
	        for (String medicament : ord) {
	            patient.ajoutMedicament(medicament);
	        }
	        patients.put(nom.toLowerCase(), patient);
	    }
	 
	 public boolean ajoutMedicament(String nom, String m) {
	        Patient patient = patients.get(nom.toLowerCase());
	        if (patient != null) {
	            patient.ajoutMedicament(m);
	            return true;
	    }else {
	            return false;
	        }
	    }
	 
	public void affichePatient(String nom) {
		 Patient patient = patients.get(nom.toLowerCase());
		        patient.affiche();
		    
		}
	
	public void affiche() {
		System.out.println("Nom de la pharmacie : " + nom);
		   for (Patient patient : patients.values()) {
		       patient.affiche();
		    }
		}
	
	public void affichePatientAvecMedicament(String m) {
	    for (Patient patient : patients.values()) {
	        if (patient.contientMedicament(m)) {
	            patient.affiche();
	        }
	    }
	}




}
