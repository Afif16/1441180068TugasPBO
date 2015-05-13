public class TestKomputer
{
	public static void main(String[] args)
	{
		Notebook asus = new Notebook(3500, 4000, 80000, 7000);
		asus.CetakSpesifikasi();
		asus.overclock(3000);
		asus.overclock(3200);
	}
}

