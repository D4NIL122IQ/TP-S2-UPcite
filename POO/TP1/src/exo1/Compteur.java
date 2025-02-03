package exo1;

public class Compteur {
	int valeur;
	Compteur(){
		valeur = 0;
	}
	
	void incrementer() {
		valeur++;
	}
	
	void decrementer() {
		valeur--;
	}
	
	void raz() {
		valeur =0;
	}
	
	int getValeur() {
		return valeur;
	}
	
	void afficherValeur() {
		System.out.println(valeur);
	}
}
