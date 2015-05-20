public class Mahasiswa
{
	private String namaMahasiswa;
	private int umurMahasiswa;


	public Mahasiswa(String nama, int umur)
	{
		namaMahasiswa = nama;
		umurMahasiswa = umur;
	}
	public void setNama(String nama)
	{
		namaMahasiswa = nama;
	}
	public String getnama()
	{
		return namaMahasiswa;
	}

	public void setUmur(int umur)
	{
		umurMahasiswa = umur;
	}
	public int getumur()
	{
		return umurMahasiswa;
	}

	public void tampilkanBiodata()
	{
		System.out.println("Nama = "+ namaMahasiswa);
		System.out.println("Umur = "+ umurMahasiswa);
	}
}