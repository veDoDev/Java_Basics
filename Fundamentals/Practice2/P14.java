import java.io.*;

class P14
{
	public static void main(String args[])
	{
		Console c = System.console();

		int num = Integer.parseInt(c.readLine("Enter the number:"));

		switch(num%2)
		{
			case 0 -> System.out.println("Even hai");
			default-> System.out.println("Odd hai");
		}				

	}

}