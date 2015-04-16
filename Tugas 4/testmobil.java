public class testmobil 
{
	public static void main(String[] args) 
	{
		mobil dwi = new mobil ();

		System.out.println("merk 	=" +dwi.getmerk());
		System.out.println("PlatNomor 	=" +dwi.getplatNomor());
		System.out.println("warna 	=" +dwi.getwarna());
		System.out.println("mesin 	=" +dwi.getmesin());
		System.out.println("kecepatan	=" +dwi.getkecepatan());	
		dwi.jalan () ;
		System.out.println(" ");

		mobil adi = new mobil ("Daihatsu","L98887BC");

		System.out.println("merk 	=" +adi.getmerk());
		System.out.println("platNomor 	=" +adi.getplatNomor());
		adi.berhenti () ;
		System.out.println(" ");

		mobil erwin = new mobil ("Honda","S4445JB","Pink");

		System.out.println("merk 	=" +erwin.getmerk());
		System.out.println("platNomor 	=" +erwin.getplatNomor());
		System.out.println("warna 	=" +erwin.getwarna());
		erwin.berbelok () ;
		System.out.println(" ");

		mobil akbar = new mobil ("Corola","S8005jb","Biru",5600);

		System.out.println("merk 	=" +akbar.getmerk());
		System.out.println("platNomor 	=" +akbar.getplatNomor());
		System.out.println("warna 	=" +akbar.getwarna());
		System.out.println("mesin 	=" +akbar.getmesin());
		akbar.mengerem () ;
		System.out.println(" ");

		mobil hanugrah = new mobil("Cayman","S1805DL","Hitam",9887,450);

		System.out.println("merk 	=" +hanugrah.getmerk());
		System.out.println("platNomor 	=" +hanugrah.getplatNomor());
		System.out.println("warna 	=" +hanugrah.getwarna());
		System.out.println("mesin 	=" +hanugrah.getmesin());
		System.out.println("kecepatan	=" +hanugrah.getkecepatan());	
		hanugrah.parkir ();
		System.out.println(" ");
	}	
}