// multiplt three numbers

import java.io.*;

class P4
{
	public static void main(String args[])
	{

		Console c = System.console();
		
		double n1 = Double.parseDouble(c.readLine("Enter first number :"));
		double n2 = Double.parseDouble(c.readLine("Enter second number :"));
		double n3 = Double.parseDouble(c.readLine("Enter third number :"));

		double res = n1*n2*n3;
		System.out.println("res = "+res);
		System.out.println("res = "+String.format("%.2f", res));
	}

}