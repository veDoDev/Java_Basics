// valid length and breadth

import java.io.*;

class P5
{

	public static void main(String args[])
	{	
		Console c = System.console();

		double length = Double.parseDouble(c.readLine("Enter the length :"));
		double breadth = Double.parseDouble(c.readLine("Enter the breadth :"));

		if(length > 0 && breadth > 0)
		{
			double area = length*breadth;
			double peri = 2*(length + breadth);

			System.out.println("area = " + area + "\nperi = "+peri);
		}
		else
			System.out.println("Invalid metrics");

	}

}