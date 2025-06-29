import java.io.*;

class P10
{
	public static void main(String args[])
	{
		Console c = System.console();

		double fah = Double.parseDouble(c.readLine("Enter the temp in fahrenheit:"));

		double cel = (5/9)*fah - 32;

		System.out.println("Temperature in celcius: " + cel);

	}

}