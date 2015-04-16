public class testTabungan 
{
	public static void main(String[] args) {
		Tabungan ilham = new Tabungan ();

		System.out.println("simpanan  =" +ilham.setsimpanan());
		System.out.println("pemilikRek  =" +ilham.setpemilikRek());
		System.out.println("noRek  =" +ilham.getnoRekening());
		System.out.println("bunga  =" +ilham.getbunga());
		ilham.menabung ();
		System.out.println(" ");



Tabungan handy = new Tabungan("HandyLaksetyo","BCA");
		System.out.println("simpanan =" +handy.setsimpanan());
		System.out.println("pemilikRek =" +handy.setpemilikRek());
		handy.menarik();
		System.out.println(" ");


Tabungan fahmi = new Tabungan("Fahmicahya","mandiri",14440098);
		System.out.println("simpanan =" +fahmi.setsimpanan());
		System.out.println("pemilikRek =" +fahmi.setpemilikRek());
		System.out.println("noRek =" +fahmi.getnoRekening());
		fahmi.transfer();
		System.out.println(" ");


Tabungan gogor = new Tabungan("Gogor","BRI",1440068,10);
		System.out.println("simpanan =" +gogor.setsimpanan());
		System.out.println("pemilikRek =" +gogor.setpemilikRek());
		System.out.println("noRek =" +gogor.getnoRekening());
		System.out.println("bunga =" +gogor.getbunga());
		gogor.menerimatransfer();
		System.out.println(" ");		


	}

}