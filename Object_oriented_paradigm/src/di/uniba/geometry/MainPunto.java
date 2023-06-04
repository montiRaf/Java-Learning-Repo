package di.uniba.geometry;

public class MainPunto {
	public static void main(String[] args) {
		Punto origine = new Punto();
		origine.setX(0);
		origine.setY(0);
		System.out.println(origine);
		origine.trasla(1, 3);
		System.out.println(origine);
		}
}
