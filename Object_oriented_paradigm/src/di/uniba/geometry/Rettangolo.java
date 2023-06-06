package di.uniba.geometry;

public class Rettangolo {
	private double base;
	private double altezza;
	private Punto vertice;
	
	public Rettangolo(double base, double altezza, Punto vertice) {
		this.setBase(base);
		this.setAltezza(altezza);
		this.setVertice(vertice);
	}
	
	public Rettangolo() {
		this(0.0, 0.0, new Punto(0.0, 0.0));
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the altezza
	 */
	public double getAltezza() {
		return altezza;
	}

	/**
	 * @param altezza the altezza to set
	 */
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	/**
	 * @return the vertice
	 */
	public Punto getVertice() {
		return vertice;
	}

	/**
	 * @param vertice the vertice to set
	 */
	public void setVertice(Punto vertice) {
		this.vertice = vertice;
	}
	
	public void draw() {
		int baseInt = (int)base;
		int altezzaInt = (int)altezza;
		
		for(int i = 0; i < altezzaInt; i++) {
			for(int j = 0; j < baseInt; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
