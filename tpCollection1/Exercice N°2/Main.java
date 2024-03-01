package atelier1_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Entrez une commande (+nom, ?nom, !, ou bye) : ");
            String commande = scanner.next();

            switch (commande) {
                case "+": 
                    System.out.println("Entrez le nom : ");
                    String nomAjout = scanner.next();
                    System.out.println("Entrez le numéro : ");
                    String numeroAjout = scanner.next();
                    System.out.println("Entrez l'adresse : ");
                    String adresseAjout = scanner.next();
                    annuaire.ajouterFiche(nomAjout, numeroAjout, adresseAjout);
                    break;

                case "?": 
                    System.out.println("Entrez le nom à rechercher : ");
                    String nomRecherche = scanner.next();
                    Fiche ficheTrouvee = annuaire.rechercherFiche(nomRecherche) ;
                    if (ficheTrouvee != null) {
                        System.out.println("Fiche trouvée : Nom " + ficheTrouvee.getNom() +
                                ", Numéro " + ficheTrouvee.getNumero() +
                                ", Adresse " + ficheTrouvee.getAdresse());
                    } else {
                        System.out.println("Aucune fiche trouvée pour le nom : " + nomRecherche);
                    }
                    break;

                case "!": 
                    annuaire.afficherAnnuaire();
                    break;

                case ".": 
                    System.out.println("Fin du programme.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Commande non reconnue.");
            }
        }}

}
