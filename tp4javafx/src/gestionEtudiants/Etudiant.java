package gestionEtudiants;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Etudiant {
    private final IntegerProperty id;
    private final StringProperty nom;
    private final StringProperty prenom;
    private final StringProperty sexe;
    private final StringProperty filiere;

    public Etudiant(int id, String nom, String prenom, String sexe, String filiere) {
        this.id = new SimpleIntegerProperty(id);
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.sexe = new SimpleStringProperty(sexe);
        this.filiere = new SimpleStringProperty(filiere);
    }

    public Etudiant(String nom, String prenom, String sexe, String filiere) {
        this.id = new SimpleIntegerProperty(0); // Default ID value
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.sexe = new SimpleStringProperty(sexe);
        this.filiere = new SimpleStringProperty(filiere);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getNom() {
        return nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public StringProperty nomProperty() {
        return nom;
    }

    public String getPrenom() {
        return prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public StringProperty prenomProperty() {
        return prenom;
    }

    public String getSexe() {
        return sexe.get();
    }

    public void setSexe(String sexe) {
        this.sexe.set(sexe);
    }

    public StringProperty sexeProperty() {
        return sexe;
    }

    public String getFiliere() {
        return filiere.get();
    }

    public void setFiliere(String filiere) {
        this.filiere.set(filiere);
    }

    public StringProperty filiereProperty() {
        return filiere;
    }
}
