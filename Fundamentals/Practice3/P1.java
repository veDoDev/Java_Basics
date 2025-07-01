// leap unsing if 

import java.io.*;

class P1
{

	public static void main(String args[])
	{
		Console c = System.console();

		int year = Integer.parseInt(c.readLine("Enter the year :"));

		if(year%4 == 0)
			System.out.println("This is a leap year");
		else
			System.out.println("This is not a leap year");

	}

}