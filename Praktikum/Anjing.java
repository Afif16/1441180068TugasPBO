class Anjing
{
	int umurAnjing;

	public Anjing(String nama)
{
	System.out.println("Nama yang diberikan:" + nama);
}
	public void aturUmur(int umur ) 
{
	umurAnjing = umur;	
}

public int ambilUmur()
{
	System.out.println("Umur anjing adalah : "+ umurAnjing );
	return umurAnjing;
}

public static void main(String[] args) 
{
	Anjing anjingku = new Anjing("tommy");

	anjingku.aturUmur(2);

	System.out.println("Nilai Variabel : "+ 
		anjingku.umurAnjing );
	}
}