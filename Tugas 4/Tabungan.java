class Tabungan  
{
	String simpanan;
	String pemilikRek;
	int noRekening;
	int bunga;

	public Tabungan () 
	{
		simpanan	= "BRI";
		pemilikRek = "Ilham";
		noRekening	= 1320068;
		bunga		= 10;

	}
	public  Tabungan(String pemilikRekInput, String simpananInput)
	{
		pemilikRek		=pemilikRekInput;
		simpanan     	=simpananInput;
	}
	public Tabungan(String pemilikRekInput, String simpananInput, int noRekeningInput)
	{
		pemilikRek		=pemilikRekInput;
		simpananInput	=simpananInput;
		noRekening		=noRekening;
	}
	public Tabungan(String pemilikRekInput, String simpananInput, int noRekeningInput, int bungaInput)
	{
		pemilikRek		=pemilikRekInput;
		simpananInput	=simpananInput;
		noRekening		=noRekening;
		bunga 			=bungaInput;
	}
		public void menabung () 
		{
			System.out.println("menabung");
		}
		public  void menarik () 
		{
			System.out.println("Anda menarik uang");
		}
		public void transfer () 
		{
			System.out.println("Anda mentransfer uang");
		}
		public  void menerimatransfer () 
		{
			System.out.println("Andan menerima transfer");
		}

		public String setpemilikRek ()
		{
			return pemilikRek;
		}
		public String setsimpanan ()
		{
			return simpanan;
		}
		public  int getnoRekening () 
		{
			return noRekening;
		}
		public int getbunga ()
		{
			return bunga;
		}
	}	
