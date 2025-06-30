// valid radius

import java.io.*;

class P4
{

	public static void main(String args[])
	{	
		Console c = System.console();

		double r = Double.parseDouble(c.readLine("Enter the radius :"));

		if(r > 0)
		{
			double area = 3.14*r*r;
			double peri = 2*3.14*r;

			System.out.println("area = " + area + "\nperi = "+peri);
		}
		else
			System.out.println("Invalid radius");

	}

}