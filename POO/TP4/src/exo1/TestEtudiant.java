package exo1;

public class TestEtudiant {
	public static void main(String[] args) {
		Etudiant  np= new Etudiant("danil",2);
		Notation[] notes = new Notation[2];
		notes[0] = new Notation(10);
		notes[1] = new Notation(12,4);
		Etudiant p = new Etudiant("hali", notes);
		p.moyenne();
		p.avis();
		p.afficher();
	}
}
