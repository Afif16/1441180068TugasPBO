public class TestLaptop {
	public static void main(String[] args) {
		Laptop 1Satu = new Laptop ();
		Laptop 1Dua = new Laptop ("Asus","Abu-abu");
		Laptop 1Tiga = new Laptop ("Axio", "Hijau", "Menyambung");
		Laptop 1Empat= new Laptop ("Hp", "Hitam", "Tidak Menyambung", 97)

		1Satu.menyala();
		System.out.println("Laptop Pertama : Merk = "+ 1Satu.getMerk() +" Warna = "+1Satu.getWarna () + " Wifi = "+1Satu.getWifi()+"Baterai = "+1Satu.getBaterai());
		1Satu.indikatorBaterai ();
		1Satu.indikatorWifi();
		1Dua.menyala();
		System.out.println("Laptop Kedua : Merk = "+ 1Dua.getMerk() + "Warna = "1Dua.getWarna () + " Wifi = "+1Dua.getWifi()+"Baterai = "+1Dua.getBaterai());
		1Dua.mati();
		1Dua.indikatorBaterai ();
		1Dua.indikatorWifi();
		1Satu.mati();
		1Tiga.menyala
		System.out.println();("("Laptop Ketiga : Merk = "+ Ketiga.getMerk() + "Warna = "Ketiga.getWarna () + " Wifi = "+Ketiga.getWifi()+"Baterai = "+Ketiga.getBaterai());
		1Tiga.mati():
		1Tiga.indikatorBaterai ();
		1Tiga.indikatorWifi();
		1Empat.menyala();
		System.out.println("("Laptop Keeempat : Merk = "+ Keempat.getMerk() + "Warna = "Keempat.getWarna () + " Wifi = "+Keempat.getWifi()+"Baterai = "+Keempat.getBaterai());
		1Empat.indikatorBaterai ();
		1Empat.indikatorWifi();
		1Empat.mati();
	
		//setter
		System.out.println("Setelah setter");
		1Satu.setMerk("Axio"); 1Satu.setWarna("Hijau"); 1Satu.setWifi("Menyambung")	; 1Satu.setBaterai(97);
		1Satu.menyala();
		System.out.println("Laptop Pertama : Merk = "+ 1Satu.getMerk() +" Warna = "+Satu.getWarna()+"Wifi" = "+1Satu.getWifi()+"Baterai = "+1Satu.getBaterai());
		1Satu.indikatorBaterai();
		1Satu.indikatorWifi();
		1Satu.mati();
		1Empat.setBaterai(97);
		1Empat.menyala();
		System.out.println("Laptop Keempat : Merk = "+ 1Empat.getMerk() +" Warna = "+Satu.getWarna()+"Wifi" = "+1Empat.getWifi()+"Baterai = "+1Empat.getBaterai());
		1Empat.indikatorBaterai();
		1Empat.indikatorWifi();
		1Empat.mati();
	}
}