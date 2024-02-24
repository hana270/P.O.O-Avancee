package atelier1;

public class Note implements Comparable<Note> , Statisticable{
private String intitule;
private float note;

public Note(String intitule, float note) {
	this.intitule = intitule;
	this.setNote(note);;
}

public String getIntitule() {
	return intitule;
}
public float getNote() {
	return note;
}
public void setIntitule(String intitule) {
	this.intitule = intitule;
}
public void setNote(float note) {
	if(note>=0 && note <21) {
		this.note = note;
	}
	
}



@Override
public String toString() {
	return this.getClass().getSimpleName()+" intitule=" + intitule + "/ note= " + note;
}

@Override
public int compareTo(Note o) {
    if (this.getValue() == o.getValue()) {
        return 0;
    } else if (this.getValue() > o.getValue()) {
        return 1;
    } else {
        return -1;
    }
}

@Override
public float getValue() {
	return this.getNote();
}



}
