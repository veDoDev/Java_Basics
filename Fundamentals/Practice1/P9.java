import java.io.*;

class P9
{
	public static void main(String args[])
	{
		Console c = System.console();

		double cel = Double.parseDouble(c.readLine("Enter the temp in celcius:"));

		double fah = (9/5)*cel + 32;

		System.out.println("Temperature in fahrenheit: " + fah);

	}

}