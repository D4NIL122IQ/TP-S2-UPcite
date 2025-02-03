package exo1;

public class TesteCompteur {
	public static void main(String[] args) {
		Compteur test = new Compteur();
		test.incrementer();
		test.incrementer();
		test.incrementer();
		System.out.println(test.getValeur());
		test.decrementer();
		test.raz();
		System.out.println(test.getValeur());
	}
}
