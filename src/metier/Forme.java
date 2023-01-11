package metier;

public abstract class Forme implements IForme  {
	protected Point centreGravier;

	public Forme(Point p) {
		super();
		this.centreGravier=p;
	}
	public Point centreGravier() {
		return centreGravier;
	}
public void placer(Point p) {
	centreGravier.setLocation(p);
}
public void translater(double x,double y) {
	centreGravier.setLocation(centreGravier.getX()+ x, centreGravier.getY()+y);
}
@Override
public String toString() {
	return this.getClass().getName()+"de centre("+ centreGravier.getX()+","+ centreGravier.getY()+")";
}
public void affiche(IForme f) {
	System.out.println("la forme"+centreGravier);
}
}
