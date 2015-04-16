public class mobil 
{
	String merk;
	String platNomor;
	String warna;
	int mesin;
	int kecepatan;


	public mobil ()
	{
		merk		="Toyota";
		platNomor	="S970116QZ";
		warna		="Silver";
		mesin		=1000;
		kecepatan	=100;
	}	
	public mobil(String merkInput, String platNomorInput) 
	{
		merk 		=merkInput;
		platNomor   =platNomorInput;

	}
	public mobil(String merkInput, String platNomorInput, String warnaInput)
	{
		merk 		=merkInput;
		platNomor   =platNomorInput;
		warna 		=warnaInput;

	}
	public mobil(String merkInput, String platNomorInput, String warnaInput, int mesinInput)
	{
		merk 		=merkInput;
		platNomor   =platNomorInput;
		warna 		=warnaInput;
		mesin		=mesinInput;

	}
	public mobil(String merkInput, String platNomorInput, String warnaInput, int mesinInput, int kecepatanInput )
	{
		merk 		=merkInput;
		platNomor   =platNomorInput;
		warna 		=warnaInput;
		mesin		=mesinInput;
		kecepatan   =kecepatanInput;
	}

	public void jalan () 
	{
		System.out.println("mobil akan berjalan");
	}
	public  void berhenti () 
	{
		System.out.println("mobil akan berhenti");
	}
	public  void berbelok () 
	{
		System.out.println("mobil akan berbelok");
	}
	public void mengerem () 
	{
		System.out.println("mobil akan mengerem");
	}
	public void parkir () 
	{
		System.out.println(" mobil akan parkir");
	}
	public  String getmerk () 
	{
		return merk;
	}
	public  String getplatNomor () 
	{
		return platNomor;
	}
	public String getwarna () 
	{
		return warna;
	}
	public int getmesin () 
	{
		return mesin;
	}
	public int getkecepatan () 
	{
		return kecepatan;
	}

}