public class TestLaptop {
	public static void main(String[] args) {
		Laptop 1Satu = new Laptop ();
		Laptop 2Dua = new Laptop ("Asus","Abu-abu");
		Laptop 3Tiga = new Laptop ("Axio", "Hijau", "Menyambung");
		Laptop 4Empat= new Laptop ("Hp", "Hitam", "Tidak Menyambung", 97)

		1Satu.menyala();
		System.out.println("Laptop Pertama : Merk = "+ 1Satu.getMerk() +" Warna = "+1Satu.getWarna () + " Wifi = "+1Satu.getWifi()+"Baterai = "+1Satu.getBaterai());
		1Satu.indikatorBaterai ();
		1Satu.indikatorWifi();
		2Dua.menyala();
		System.out.println("Laptop Kedua : Merk = "+ 2Dua.getMerk() + "Warna = "2Dua.getWarna () + " Wifi = "+2Dua.getWifi()+"Baterai = "+2Dua.getBaterai());
		2Dua.mati();
		2Dua.indikatorBaterai ();
		2Dua.indikatorWifi();
		1Satu.mati();
		3Tiga.menyala
		System.out.println();("("Laptop Ketiga : Merk = "+ Ketiga.getMerk() + "Warna = "Ketiga.getWarna () + " Wifi = "+Ketiga.getWifi()+"Baterai = "+Ketiga.getBaterai());
		3Tiga.mati():
		3Tiga.indikatorBaterai ();
		3Tiga.indikatorWifi();
		4Empat.menyala();
		System.out.println("("Laptop Kempat : Merk = "+ Kempat.getMerk() + "Warna = "Kempat.getWarna () + " Wifi = "+Kempat.getWifi()+"Baterai = "+Kempat.getBaterai());
		4Empat.indikatorBaterai ();
		4Empat.indikatorWifi();
		4Empat.mati();
		//setter
		System.out.println("Setelah setter");
		1Satu.setMerk("Axio"); 1Satu.setWarna("Hijau"); 1Satu.setWifi("Menyambung")	; 1Satu.setBaterai(97);
		1Satu.menyala();
		System.out.println("Laptop Pertama : Merk = "+ 1Satu.getMerk() +" Warna = "+Satu.getWarna()+"Wifi" = "+1Satu.getWifi()+"Baterai = "+1Satu.getBaterai());
		1Satu.indikatorBaterai();
		1Satu.indikatorWifi();
		1Satu.mati();
		4Empat.setBaterai(97);
		4Empat.menyala();
		System.out.println("Laptop Kempat : Merk = "+ 4Empat.getMerk() +" Warna = "+Satu.getWarna()+"Wifi" = "+4Empat.getWifi()+"Baterai = "+4Empat.getBaterai());
		4Empat.indikatorBaterai();
		4Empat.indikatorWifi();
		4Empat.mati();
	}
}