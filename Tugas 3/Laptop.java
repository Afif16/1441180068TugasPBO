	public class Laptop{
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;

	public Laptop()

	{
	  	merk		= "Acer";
	  	warna		= "Silver";
	  	wifi		= "Terhubug";
 	  	baterai     = 50;
	}
	public Laptop(String merkinput, String warnainput)
	{

	  	merk  	  = merkinput;
	  	warna     = warnainput;
	}
	public Laptop(String merkinput, String warnainput, String wifiinput)
	{
	  	merk      = merkinput;
	  	warna     = warnainput;
	  	wifi      = wifiinput;
	}
	public Laptop(String merkinput, String warnainput, String wifiinput, int bateraiinput)
	{
	 	 merk 		= merkinput;
	 	 warna     	= warnainput;
	  	wifi      	= wifiinput;
	  	baterai   	= bateraiinput;
	}
	public void menyala()
	{

		System.out.println("Welcome to laptop");
	}

	public void mati()
	{
		System.out.println("Thankyou have nice day");
	}

	public void indikatorBaterai()
	{
		System.out.println("Baterai tiggal : "+ baterai + "%");
	}

	public void indikatorwifi()
	{
		System.out.println("wifinya : "+wifi);
	}

	public String getmerk()
	{
		return merk;
	}
	public String getwarna()
	{
		return warna;
	}
	public String getwifi()
	{
		return wifi;
	}
	public int getbaterai()
	{
	return baterai;
	}
}





