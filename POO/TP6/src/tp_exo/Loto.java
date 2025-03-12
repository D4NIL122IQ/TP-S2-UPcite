package tp_exo;
import java.util.ArrayList;

public class Loto {
	ArrayList<Integer> listLoto = new ArrayList<>(7);
	private int interval = 49;
	
	Loto(){
		this.genererNumero();
	}
	
	private  void genererNumero() {
		for(int i=0; i<7; i++) {
			int temp = (int)(Math.random()*interval);
			if(listLoto.isEmpty()) {
				listLoto.set(i,Integer.valueOf(temp));
			}else {
				while(listLoto.contains(Integer.valueOf(temp))) {
					temp = (int)(Math.random()*interval);
				}
				listLoto.set(i,Integer.valueOf(temp));
			}
		}
	}
	
	
	void afficher() {
		for(Integer i:listLoto) {
			System.out.println("Numero "+(i+1)+ " : " +i);
		}
	}
	
	
}
