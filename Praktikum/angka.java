public class angka
{
	public static void main(String args []) 
	{
		int [] angka ={ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};

		for (int x : angka ) 
		{
			if ( x ==30) 
			{
				continue;
			}
			System.out.println( x );
			System.out.println("\n");
		}
		
	}
}