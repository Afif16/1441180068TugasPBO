public class Segitiga 
{
	int radius;

	double panjangSegitiga;
	double tinggiSegitiga;
	double luas;
	double keliling;
	double panjang;
	double tinggi;

public Segitiga(double panjang, double tinggi)
	{
	panjangSegitiga = panjang;
	tinggiSegitiga = tinggi;
	}	

public void rbhproperty(double panjang, double tinggi)
	{	
		panjangSegitiga = panjang;
		tinggiSegitiga = tinggi;
	}

public double luas()
	{
	luas = 0.5*panjang*tinggi;
	return luas;
	}

public double keliling()
	{
	double sisiMiring = Math.sqrt((panjang*panjang) + (tinggi * tinggi));
	keliling = panjang+tinggi+sisiMiring;
	return keliling;
	}

public void tampilakanProperty()
	{
	System.out.println("Panjang Segitiga = " + panjangSegitiga);
	System.out.println("Tinggi Segitiga = " + tinggiSegitiga);
	}

}