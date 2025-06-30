import java.io.*;

class P9
{
	public static void main(String args[])
	{
		Console c = System.console();

		int r = Integer.parseInt(c.readLine("Enter the rating:"));

		if((r < 1)||(r > 5))
			System.out.println("Invalid rating");
		else if((r == 5)||(r==4))
			System.out.println("Excellent");
		else if((r == 3)||(r==2))
			System.out.println("OK");
		else if(r == 1)
			System.out.println("poor");
	}

}