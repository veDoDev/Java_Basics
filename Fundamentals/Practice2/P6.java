import java.io.*;

class P6
{
	public static void main(String args[])
	{
		Console c = System.console();

		int n1 = Integer.parseInt(c.readLine("Enter the first number :"));
		int n2 = Integer.parseInt(c.readLine("Enter the second number :"));

		
		//method 1
		if(n1 > n2)
			System.out.println("Minimum : " + n2);
		else
			System.out.println("Minimum : " + n1);

		//method 2

		System.out.println("Minimum : "+ Math.min(n1,n2));
	}

}