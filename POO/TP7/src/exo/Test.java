package exo;
import java.util.List;
public class Test {
	public static void main(String [] args) {
		Point p = new Point(1,8);
		Point p2 = new Point(2,8);
		Point p3 = new Point(2,4);
		Point p4 = new Point(1,4);
		Point p5 = new Point(1,8);
		
		Point sommets[] = {p,p2,p3,p4};
		Polygone py = new Polygone(sommets);

//		py.affiche();
//		System.out.println(py.nombreDeSommets());
		
		Carre ca = new Carre(p, 4);
		
		CollectionPolygone test = new CollectionPolygone();
		test.ajouterPolygone(py);
		test.ajouterPolygone(ca);
		test.afficher();
		
	}
}
