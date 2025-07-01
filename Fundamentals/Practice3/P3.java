// while

import java.io.*;

class P3
{
	public static void main(String args[])
	{
		Console c = System.console();

		int jap = Integer.parseInt(c.readLine("Enter the number of japs : "));

		int count = 1;

		while(count <= jap)
		{
			System.out.println(count);
			System.out.println("hare rama");
			System.out.println("hare krishn");
			System.out.println("radhe radhe");
			System.out.println("--------------");
			count++;
		}

	}

}