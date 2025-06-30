import java.io.*;

class P13
{
	public static void main(String args[])
	{
		Console c = System.console();

		int num = Integer.parseInt(c.readLine("Enter the number:"));

		if(num%2 == 0)	System.out.println("Even hai");
		else	System.out.println("Odd hai");
				

	}

}