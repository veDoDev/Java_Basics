import java.io.*;

class P2
{
	public static void main(String args[])
	{
		Console c = System.console();
		String name = c.readLine("Enter your name:");
		String msg = "Welcome "+name;
		System.out.println(msg);
	}


}