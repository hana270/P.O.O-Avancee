package atelier1;

import java.util.ArrayList;
import java.util.Collections;

public class Stats{

	 public static  Note maxNote(Etudiant e) {
	        ArrayList<Note> notes = e.getNotes();
	        Note maxNote = notes.get(0);
	        for (Note note : notes) {
	            if (note.compareTo(maxNote) == 1) {
	                maxNote = note;
	            }}
	        return maxNote;
	    }
	 
	 public static Note minNote(Etudiant e) {
	        ArrayList<Note> notes = e.getNotes();
	        Note minNote = notes.get(0);
	        for (Note note : notes) {
	            if (note.compareTo(minNote) == -1) {
	            	minNote = note;
	            }}
	        return minNote;
	    }
	 public float moyNote(Etudiant e) {
		    ArrayList<Note> notes = e.getNotes();
		    float sum = 0;
		    for (Note note : notes) {
		        sum += note.getValue();
		    }
		    return sum / notes.size();
		}
	 
public float moyGroupe(ArrayList<Etudiant> etudiants) {	  
float sum = 0;
	for (Etudiant e : etudiants) {
		sum += moyNote(e);
	}
	return sum / etudiants.size();
			}

public Etudiant meilleurEtudiant(ArrayList<Etudiant> etudiants) {  
    return (Collections.max(etudiants));
}

public Etudiant moinsbonEtudiant(ArrayList<Etudiant> etudiants) {  
    return (Collections.min(etudiants));
}



	

}
