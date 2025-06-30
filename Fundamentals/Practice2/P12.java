import java.io.*;

class P12
{
	public static void main(String args[])
	{
		Console c = System.console();

		int r = Integer.parseInt(c.readLine("Enter the rating:"));

		switch (r)
		{
			case 1 		->		System.out.println("poor");		
			case 2,3	->		System.out.println("OK");		
			case 4,5	->		System.out.println("Excellent");	
			default		->		System.out.println("Invalid");
		}

	}

}