package exo1;

public class Trinome {
	private double a,b,c;
	private double delta;
	private double r1, r2;
	
	public Trinome(double c1,double c2, double c3){
		a = c1;
		b = c2;
		c = c3;
		delta = -1.0; 
		r1 = 0;
		r2 = 0;
	}
	
	public Trinome() {
		this(0, 0,0);
	}
	//Méthodes
	public void calculRacines(){
		delta = Math.pow(b,2) - 4*a*c; 
	
		if(delta >= 0) {
			
			if(delta == 0) {
				r1 = -1 * (b /2*a);
			}else {
				r1 = ((-1 * b) - Math.sqrt(delta) )/ 2*a;
				r2 = ((-1 * b) + Math.sqrt(delta) )/ 2*a;
			}
		}
	}
	//Affichage en ligne de commande
	
	public void afficheRacines(){
		if(delta > 0) {
			System.out.println("l'equation contient deux racine la r1 : "+r1 +" la r2 : "+r2);
		}
		if(delta == 0) {
			System.out.println("l'equation contient une seule racine la r1 : "+r1 );
		}
		if(delta < 0) {
			System.out.println("l'euation ne contient pas de racine");
		}
	}


}
