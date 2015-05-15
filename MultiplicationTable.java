//output Multiplication Tabel

public class MultiplicationTable {
	
	public static void main(String[] args) {

		for (int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if (i<=j)
					System.out.print("\t" + (i*j));
				else
					System.out.print("\t");
			}
			System.out.println();
		}

	}
	
}