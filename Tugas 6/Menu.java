import java.util.Scanner;

public class Menu 
 {
 	public static void main(String[] args) 
 	{
 	for (int i=1;i<999;)
 		{
 		Scanner input = new Scanner (System.in);
 		System.out.println(" Alat Penghitung");
 		System.out.println("Jenis operasi : ");
 		int menu = input.nextInt();
 		System.out.println("");
 		System.out.println(" Pilihan operasi ");
 		System.out.println(" 1. Jumlah");
 		System.out.println(" 2. Pengurangan");
 		System.out.println(" 3. Kali");
 		System.out.println(" 4. Bagi");
 		System.out.println(" 5. Exit");
 		System.out.println("");
 		
 		System.out.println(" Masukan bilangan pertama : ");
 		int bil1 = input.nextInt();

 		System.out.println(" Masukan bilangan kedua ");
 		int bil2 = input.nextInt();


 		


 		Menu:
 			switch(menu)
 			{
 				case 1:
 				System.out.println(" Hasil Penjumlahan " +bil1+ "+" +bil2+ "=" +(bil1+bil2));
 				System.out.println("");
 				break;

 				case 2:
 				System.out.println(" Hasil Pengurangan " +bil1+ "-" +bil2+ "=" +(bil1+bil2));
 				System.out.println("");
 				break;

 				case 3:
 				System.out.println(" Hasil Perkalian " +bil1+ "*" +bil2+ "=" +(bil1+bil2));
 				System.out.println("");
 				break;

 				case 4:
 				System.out.println(" Hasil Pembagian " +bil1+ "/" +bil2+ "=" +(bil1+bil2));
 				System.out.println("");
 				break;

 				case 5:
 				System.out.println(" Anda keluar dari operasi ini, Terimakasi ");
 				 System.exit(0);
 				System.out.println("");
 				break; 
 			}
 			
 		}

 	}
 }