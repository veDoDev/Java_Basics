import java.io.*;

class P10
{
	public static void main(String args[])
	{
		Console c = System.console();

		int r = Integer.parseInt(c.readLine("Enter the rating:"));

		switch (r)
		{
			case 1:		System.out.println("poor");		break;
			case 2:		System.out.println("OK");		break;
			case 3:		System.out.println("OK");		break;
			case 4:		System.out.println("Excellent");	break;
			case 5:		System.out.println("Excellent");	break;
			default:	System.out.println("Invalid");
		}

	}

}