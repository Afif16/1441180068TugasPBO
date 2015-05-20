public class testSegitiga
{
	public static void main(String[] args) 
	{
		Segitiga sgtiga = new Segitiga(5,10);
		sgtiga.panjang=5;
		sgtiga.tinggi=10;
		sgtiga.tampilkanProperty();
		System.out.println("Luas Segitiga " + sgtiga.luas());
		System.out.println("Keliling Segitiga " + sgtiga.keliling());

		sgtiga.rbhproperty(8,8);
		System.out.println("New Data = ");
		sgtiga.panjang=8;
		sgtiga.tinggi=8;
		sgtiga.tampilkanProperty();
		System.out.println("Luas Segitiga" + sgtiga.luas());
		System.out.println("Keliling Segitiga" + sgtiga.keliling());
	}
}