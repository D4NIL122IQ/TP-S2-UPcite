package exo;

public class Rectangle extends Polygone {
	String couleur;
	
	public Rectangle(Point p1, Point p2){
		super(new Point[] {
				p1,
				new Point(p1.getX() , p2.getY()),
				p2,
				new Point(p2.getX(), p1.getY())
		});
	}
	
	public Rectangle(Point p, float largeur, float longeur) {
		super(new Point[]{
				p,
				new Point(p.getX() , p.getY() + largeur),
				new Point(p.getX()+ longeur , p.getY() + largeur),
				new Point(p.getX()+longeur , p.getY())
		});
	}
	
	protected String nomFigure() {
		return "Rectangle";
	}
}
