// for

import java.io.*;

class P5
{
	public static void main(String args[])
	{
		Console c = System.console();

		int jap = Integer.parseInt(c.readLine("Enter the number of japs : "));

		for(int i = 1; i <= jap; i++)
		{
			System.out.println(i);
			System.out.println("hare rama");
			System.out.println("hare krishn");
			System.out.println("radhe radhe");
			System.out.println("--------------");
		}
	}

}