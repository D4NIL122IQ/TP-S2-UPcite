package exo1;

public class Notation {
	private int coef;
	private float note;
	
	public Notation(float note, int coef) {
		this.note = note;
		this.coef = coef;
	}
	public Notation(float note) {
		this(note,1);
	}
	public int getCoef() {
		return coef;
	}
	public float getNote() {
		return note;
	}
	
	public String toString() {
		return "note : "+note + " Coef : "+coef;
	}
	
	void afficher() {
		System.out.println("note : "+note +" Coef : "+ coef);
	}
}
