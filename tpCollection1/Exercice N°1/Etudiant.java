package atelier1;
import java.util.ArrayList;

public class Etudiant implements Comparable <Etudiant> , Statisticable{	
private int matricule;
private String nom;
private ArrayList<Note> notes;

public Etudiant(int m, String n) {
    this.matricule = m;
    this.nom = n;
//pour initialiser la liste de notes
    this.notes = new ArrayList<>(); 
 
}
public void addNote(String intitule,float note) {
	Note note1= new Note(intitule,note);
	notes.add(note1);	
}
public int getMatricule() {
	return matricule;
}

public String getNom() {
	return nom;
}

public ArrayList<Note> getNotes() {
	return notes;
}

public void setMatricule(int matricule) {
	this.matricule = matricule;
}

public void setNom(String nom) {
	this.nom = nom;
}

public void setNotes(ArrayList<Note> notes) {
	this.notes = notes;
}




@Override
public String toString() {
	return this.getClass().getSimpleName()+" : Matricule=" + matricule + ", nom=" + nom + ", notes = " + notes ;
}

@Override
public float getValue() {
	float s=0;
	for (Note i : notes) {
		s+=i.getNote();
}
    return s/notes.size();
	
}

@Override
public int compareTo(Etudiant o) {
	if(this.getValue()==o.getValue()) {
		return 0;
	}else if(this.getValue() > o.getValue()) {
		return 1;
	}else {
		return -1;
	}
}









}
