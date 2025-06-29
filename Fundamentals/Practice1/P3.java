import java.io.*;

class P3
{
	public static void main(String args[])
	{

		Console c = System.console();

		int num1 = Integer.parseInt(c.readLine("Enter the first number: "));
		int num2 = Integer.parseInt(c.readLine("Enter the second number: "));
		int res = num1+num2;
		System.out.println("Addition: " + res);

	}

}