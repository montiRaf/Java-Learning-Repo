package di.uniba.geometry;

/**
 * Classe che rappresenta un Punto nel piano cartesiano
 * @author Raffaele Monti
 *
 */
public class Punto {
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Punto() {
		this(0, 0);
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	public void trasla(double dx, double dy) {
		setX(getX()+dx);
		setY(getY()+dy);
	}
	
	@Override
	public String toString() {
		return "X: " + getX() + " - Y: " + getY(); 
	}
	
}
