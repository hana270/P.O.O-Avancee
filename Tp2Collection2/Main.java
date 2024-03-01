package atelier2;

public class Main {

	public static void main(String[] args) {

        DossierPharmacie pharmacie = new DossierPharmacie("Pharmacie");

        pharmacie.nouveauPatient("Hana", new String[]{"Aspirin", "Paracetamol"});
        pharmacie.nouveauPatient("Amal", new String[]{"Paracetamol", "Grpex", "Vitamin C"});
        pharmacie.nouveauPatient("Ahlem", new String[]{"Doliprane", "Vitamin E"});
        
        pharmacie.affiche();
        pharmacie.ajoutMedicament("Hana", "Vitamin D");
        pharmacie.affichePatient("Amal");
        pharmacie.affichePatientAvecMedicament("Paracetamol");	

	}

}
