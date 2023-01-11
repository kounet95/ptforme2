package metier;

public class Rectangle extends Forme {
	private double longueur;
	private double largeur;

	public Rectangle(Point p, double longueur, double largeur) {
		super(p);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	public double perimetre() {
		return 2*(longueur+largeur);
	}
	public double surface() {
		return longueur*largeur;
	}
	public void changeLongueur(double nouveleLongueur) {
		longueur=nouveleLongueur;
	}
	public void changeLargeur(double nouveleLargeur) {
		largeur=nouveleLargeur;
	}
	
	
	public double Largeur() {
		return largeur;
	}
	public void Largeur(double largeur) {
		this.largeur = largeur;
	}
	
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}
	
	@Override
	public Point centreGravite() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void place(Point nouveauCentreGravite) {
		// TODO Auto-generated method stub
		
	}	

}
