// do - while (n)(n-1)/2

import java.io.*;

class P8
{
	public static void main(String args[])
	{
		Console c = System.console();

		int n = Integer.parseInt(c.readLine("Enter the number :"));

		if(n > 0)
		{
			int  sum = 0;
			for(int i = 0; i <= n; i++)
			{
				sum = sum + i;
			}
			System.out.println("sum is :" + sum);

		}
		else
			System.out.println("Invalid input");

	}

}