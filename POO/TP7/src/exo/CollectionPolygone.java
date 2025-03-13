package exo;
import java.util.List;
import java.util.ArrayList;

public class CollectionPolygone {
	private List<Polygone> polygone;
	
	public CollectionPolygone(List<Polygone> polygone){
		this.polygone = polygone;
	}
	
	public CollectionPolygone() {
		this(new ArrayList<Polygone>());
	}
	
	void ajouterPolygone(Polygone polygone) {
		this.polygone.add(polygone);
	}
	
	public String toString() {
		StringBuffer temp = new StringBuffer();
		
		//int i =0;
		temp.append("Mes polygones : \n");
//		while(i<polygone.size()) {
//			temp.append(polygone.get(i).toString());
//			temp.append("\n");
//			i++;
//		}
		for(Polygone poly : polygone) {
			temp.append(poly.toString()+"\n");
		}
		
		return temp.toString();
	}
	
	void afficher() {
		System.out.println(this.toString());
	}
}
