import java.io.*;

class P3
{
	public static void main(String args[])
	{
		Console c = System.console();

		System.out.println("Welcome");
		

		try
		{
			int a = Integer.parseInt(c.readLine("Enter a : "));
			int b = Integer.parseInt(c.readLine("Enter b : "));

			int res = a/b;
			System.out.println("a/b = " + a/b);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter integers only");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Infinity");
		}
		

		System.out.println("Thank you");
	}

}