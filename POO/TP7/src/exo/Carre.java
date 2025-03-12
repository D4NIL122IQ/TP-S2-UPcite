package exo;

public class Carre extends Polygone {
	
	public Carre(Point p , float cote) {
		super(new Point[] {
				p,
				new Point(p.getX(), p.getY() + cote),
				new Point(p.getX()+cote, p.getY() + cote),
				new Point(p.getX()+cote, p.getY())
		});
	}
	
	protected String nomFigure() {
		return "Carre";
	}
}
