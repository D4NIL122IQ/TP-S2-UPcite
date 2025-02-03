package exo2;

public class Etudiant {
	String nom;
	float tabNotes[] = new float[5];
	float moyenne;
	String resultat;
	
	Etudiant(String n){
		nom = n;
		moyenne = 0;
		for(int i =0; i<5; i++) {
			tabNotes[i] = 0;
		}
		resultat = "non admis";
	}
	Etudiant(String n, float tabN[]){
		nom = n;
		resultat = "non admis";
		for(int i =0; i<5; i++) {
			tabNotes[i] =  tabN[i];
		}
	}
	
	void setNote(int indice , float note) {
		tabNotes[indice-1] =(indice >5)? 0: note;
	}
	void calculerMoyenne() {
		for(int i =0; i<5; i++) {
			moyenne += tabNotes[i];
		}
		moyenne /= 5;
		if(moyenne >= 10) {
			resultat = "admis";
		}
	}
	void afficher() {
		System.out.println("Nom : "+nom + "Moyenne : "+moyenne + "Resultat : "+resultat);
	}
}
