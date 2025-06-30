import java.io.*;


class P7
{
	public static void main(String args[])
	{
		Console c = System.console();

		double n1 = Double.parseDouble(c.readLine("Enter the first number : "));
		double n2 = Double.parseDouble(c.readLine("Enter the second number : "));
		double n3 = Double.parseDouble(c.readLine("Enter the third number : "));
		double n4 = Double.parseDouble(c.readLine("Enter the fourth number : "));

		System.out.println("Max = " + Math.max(Math.max(n1,n2), Math.max(n3,n4)));
		System.out.println("Min = " + Math.min(Math.min(n1,n2), Math.min(n3,n4)));

	}

}