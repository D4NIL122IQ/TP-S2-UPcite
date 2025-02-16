package exo2;

public class TriNombres {
	int[] tab;
	
	TriNombres(int t[]){
		tab= t;
	}
	
	
	void tri() {
		int p =0 ;
		int j=tab.length;
		boolean t = false;
		while(j>1 && !t) {
			t = true;
			for(int i=0; i<j-1; i++) {
				if(tab[i] > tab[i+1]) {
					p = tab[i];
					tab[i] = tab[i+1];
					tab[i+1] = p;
					t = false;
				}
			}
			j--;
		}
	}
	void afficher() {
		for(int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
}
