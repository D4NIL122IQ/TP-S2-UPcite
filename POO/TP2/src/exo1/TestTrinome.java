package exo1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class TestTrinome {
	public static void main(String[] args) {
		Trinome t1;
		double a, b, c;
		// methode 1 : utilisation de la classe saisie
		System.out.println("Entrez les valeur de l'equation ax²+bx+c \n");
		a = Saisie.lireEntier("Valeur de a ?");
		b = Saisie.lireEntier("Valeur de b ?");
		c = Saisie.lireEntier("Valeur de c ?");
		t1 = new Trinome(a, b, c);
		t1.calculRacines();
		t1.afficheRacines();

		// methode 2 : utilisation de Scanner
		Scanner lecteur = new Scanner(System.in);

		System.out.println("Entrez les valeur de l'equation ax²+bx+c \n");
		System.out.println("Valeur de a ?");
		a = lecteur.nextInt();
		System.out.println("Valeur de b ?");
		b = lecteur.nextInt();
		System.out.println("Valeur de c ?");
		c = lecteur.nextInt();
		t1 = new Trinome(a, b, c);
		t1.calculRacines();
		t1.afficheRacines();
		lecteur.close();

		// methode 3 : utilisation de la boite de dialog
		System.out.println("Utilisation de la classe JOptionPane !!!");
		
		String s = JOptionPane.showInputDialog("Valeur de a ?");
		if(s!=null){
		 a = Integer.parseInt(s);// conversion d'une chaine en entier
		}
		s = JOptionPane.showInputDialog("Valeur de b ?");
		if(s!=null){
		 b = Integer.parseInt(s);// conversion d'une chaine en entier
		}
		s = JOptionPane.showInputDialog("Valeur de c ?");
		if(s!=null){
		 c = Integer.parseInt(s);// conversion d'une chaine en entier
		}
		t1 = new Trinome(a, b, c);
		t1.calculRacines();
		t1.afficheRacines();
		lecteur.close();

	}
}