package exo1;

public class Etudiant {
	String nom;
	float moyenne;
	String avis;
	Notation notes[] = null;
	
	public Etudiant(String nom, Notation notes[]) {
		this.nom = nom;
		moyenne = 0;
		avis = "";
		this.notes = notes;
	}
	
	public Etudiant(String nom, int nbrNote) {
		this.nom = nom;
		notes = new Notation[nbrNote];
	}
	
	void setNote(Notation note, int position) {
		
		notes[position] = note;
	}
	
	public void moyenne() {
		float temp= 0;
		int co = 0;
		for(int i=0; i<notes.length;i++) {
			temp += notes[i].getNote() * notes[i].getCoef();
			co += notes[i].getCoef();
			}
		moyenne = temp/co;
	}

	public void avis(double seuil) {
		avis = (moyenne >= seuil)? "Admis":"Non admis";
	}
	public void avis() {
		avis = (moyenne >= 10)? "Admis":"Non admis";
	}
	
//	public String toString() {
//		String note ;
//		
//		return "Nom : " + nom + "moyenne : "+moyenne+ " avis : "+ avis + " notes : "+ note;
//	}
//	
	public void afficher() {
		System.out.println("Nom : "+ nom + " moyenne : "+ moyenne + " avis : " +avis+ " notes : ");
		for(int i=0; i<notes.length;i++) {
			notes[i].afficher();
		}
		
	}
	
}
