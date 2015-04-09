public class Testcircle {
	public static void main(String[] args) {
		circle cahya = new circle ();
		circle ardy = new circle (30);
		circle akbar = new circle (60, "abangGalau");

		System.out.println("radius = "+ cahya.radius+ "color = "+ cahya.color + "Luas = "+ cahya.getArea());
		System.out.println("radius = "+ ardy.radius+ "color = "+ ardy.color + "Luas = "+ ardy.getArea());
		System.out.println("radius = "+ akbar.radius+ "color = "+ akbar.color + "Luas = "+ akbar.getArea());
	}

