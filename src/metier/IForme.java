package metier;

public interface IForme {
	public double perimetre();
	public double surface();
	public Point centreGravite();
	public void place(Point nouveauCentreGravite);
	public void translater(double dx,double dy);
	
}
