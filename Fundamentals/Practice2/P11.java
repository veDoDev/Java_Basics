import java.io.*;

class P11
{
	public static void main(String args[])
	{
		Console c = System.console();

		int r = Integer.parseInt(c.readLine("Enter the rating:"));

		switch (r)
		{
			case 1:		System.out.println("poor");		break;
			case 2,3:	System.out.println("OK");		break;
			case 4,5:	System.out.println("Excellent");	break;
			default:	System.out.println("Invalid");
		}

	}

}