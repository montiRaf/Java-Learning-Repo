package di.uniba.geometry;

public class MainTest {
	public static void main(String[] args) {
		var origine = new Punto();
		origine.setX(0);
		origine.setY(0);
		System.out.println(origine);
		origine.trasla(1, 3);
		System.out.println(origine);
		
		Rettangolo rect = new Rettangolo(9.5, 6, origine);
		rect.draw();
		}
}
