package atelier1;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {

        ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
        Stats stats = new Stats();

        Etudiant etudiant1 = new Etudiant(538745, "Hana");
        etudiant1.addNote("Géo", 10.5f);
        etudiant1.addNote("Info", 7.5f);
        etudiant1.addNote("Math", 13.5f);

        Etudiant etudiant2 = new Etudiant(538756, "Amal");
        etudiant2.addNote("Géo", 18.5f);
        etudiant2.addNote("Info", 9.0f);
        etudiant2.addNote("Math", 15.5f);
        
        Etudiant etudiant3 = new Etudiant(538778, "Nahla");
        etudiant3.addNote("Géo", 9.75f);
        etudiant3.addNote("Info", 6.5f);
        etudiant3.addNote("Math", 19.5f);

        listeEtudiants.add(etudiant1);
        listeEtudiants.add(etudiant2);
        listeEtudiants.add(etudiant3);

        System.out.println("Liste des étudiants :");
        for (Etudiant etudiant : listeEtudiants) {
            System.out.println(etudiant);
        }

        Collections.sort(listeEtudiants, new CompareNom());
        System.out.println("\nTri par nom :");
        for (Etudiant etudiant : listeEtudiants) {
            System.out.println(etudiant);
        }

        Collections.sort(listeEtudiants, new CompareMatricule());
        System.out.println("\nTri par matricule :");
        for (Etudiant etudiant : listeEtudiants) {
            System.out.println(etudiant);
        }

        System.out.println("\nLes moyennes des étudiants :");
        for (Etudiant etudiant : listeEtudiants) {
            System.out.println("Etudiant: " + etudiant.getNom());
            System.out.println("Moyenne: " + etudiant.getValue());
            System.out.println("Meilleure note : " + Stats.maxNote(etudiant));
            System.out.println("Moins bonne note : " + Stats.minNote(etudiant));
            System.out.println();
        }

        System.out.println("Moyenne du groupe : " + stats.moyGroupe(listeEtudiants));

        Etudiant meilleurEtudiant = stats.meilleurEtudiant(listeEtudiants);
        Etudiant moinsBonEtudiant = stats.moinsbonEtudiant(listeEtudiants);

        System.out.println("\nMeilleur étudiant du groupe : ");
        System.out.println("Matricule : " + meilleurEtudiant.getMatricule());
        System.out.println("Nom : " + meilleurEtudiant.getNom());
        System.out.println("Moyenne : " + stats.moyNote(meilleurEtudiant));

        System.out.println("\nMoins bon étudiant du groupe : ");
        System.out.println("Matricule : " + moinsBonEtudiant.getMatricule());
        System.out.println("Nom : " + moinsBonEtudiant.getNom());
        System.out.println("Moyenne : " + stats.moyNote(moinsBonEtudiant));
    }
}
