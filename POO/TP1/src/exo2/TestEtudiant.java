package exo2;

public class TestEtudiant {
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant("danil", new float[]{15, 12, 9, 10, 14});
		e1.calculerMoyenne();
		e1.afficher();
		
	}
}
