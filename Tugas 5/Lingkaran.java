public class Lingkaran
{
	int radius;
	double keliling;
	double luas;

	public Lingkaran(int radiusLingkaran)
	{
		radius = radiusLingkaran;
	}
	public  double keliling()
	{
		keliling = 2*radius*Math.PI;
		return keliling;
	}
	public double luas()
	{
		luas = radius*radius*Math.PI;
		return luas;
	}
public  void tampilkanProperty()
	{
		System.out.println("Radius = " + radius);
	}

}