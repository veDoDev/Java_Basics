// leap unsing switch

import java.io.*;

class P2
{

	public static void main(String args[])
	{
		Console c = System.console();

		int year = Integer.parseInt(c.readLine("Enter the year :"));

		switch(year%4)
		{
			case 0 ->  System.out.println("This is a leap year");
			default -> System.out.println("This is not a leap year");

		}

	}

}