public class Notebook extends Komputer
{
	int prosesor;
	int baterai;
	
	Komputer put = new Komputer();	
	
	public Notebook( int prosesorinput, int memoriinput, int storageinput, int bateraiinput)
	{
		prosesor = prosesorinput;
		memori = memoriinput;
		storage = storageinput;
		baterai = bateraiinput;
	}

	public void CetakSpesifikasi()
	{
		System.out.println("Kecepatan prosesor Komputer = "+put.Komputer());
		System.out.println("Kecepatan prosesor notebook = "+ prosesor);
		System.out.println("Kapasitas memori = "+ memori);
		System.out.println("Kapasitas storage = "+ storage);
		System.out.println("Kapasitas baterai = "+ baterai);
	}
	public void overclock(int prosesor)
	{
		System.out.println("dioverclock dengan kecepatan prosesor = "+ prosesor);

	}
}