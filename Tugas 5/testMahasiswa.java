public class testMahasiswa
{

	public static void main(String[] args) 
	{
		Mahasiswa mhs = new Mahasiswa("Mochamad Afif",19);
		mhs.tampilkanBiodata();

		System.out.println();

		mhs.setUmur(25);
		mhs.tampilkanBiodata();

	}
}