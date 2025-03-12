package exo;

public class Polygone {
	//Attribut
	private Point[] sommets;
	
	//Constructeurs
	public Polygone(Point[] sommets) {
		this.sommets = sommets;
	}
	
	public Polygone(int nbSommets) {
		this(new Point[nbSommets]);
	}
	
	//Méthodes
	
	//Ajoute un sommet dans le tableau sommets
	public void setUnSommet(Point p, int pos){
			sommets[pos] = p;
	}
	
	//mettre à jour tous les sommets
	public void setSommets(Point[] sommets){
		this.sommets = sommets;
	}
	
	//Retourne le nom de la figure (Polygone dans le cas présent)
	protected String nomFigure() {
		return "Polygone";
	}

	//Retourne le nombre de sommets
	public int nombreDeSommets() {
		return sommets.length;
	}
	
	//retourne une chaine contenant les coordonnées des sommets
	//Elle se présente sous la forme : "Polygone : [(0.0,0.0) (2.0,0.0)
	/// (2.0,2.0) (0.0,2.0) ]"
	public String toString() {
		StringBuffer temp = new StringBuffer();
		temp.append(nomFigure() +":[");
		
		temp.append(sommets[0].toString());
		
		for(int i = 1; i<sommets.length; i++) {
			temp.append(", " +sommets[i].toString());
		}
		temp.append("]");
		return temp.toString();
	}
	//Affiche les coordonnées des sommets
	public void affiche(){
		System.out.println(this.toString());
	
		
	}
	///Calcul le périmètre (somme des côtés) du polygone
	public float perimetre() {
		float pr = 0.0f;
		int i =0;
		for(i=0; i< sommets.length -1  ; i++) {
			pr += sommets[i].distance(sommets[i+1]);
		}
		pr += sommets[i].distance(sommets[0]);
		return pr;
	}
}
