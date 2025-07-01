// do - while (n)(n-1)/2

import java.io.*;

class P7
{
	public static void main(String args[])
	{
		Console c = System.console();

		int n = Integer.parseInt(c.readLine("Enter the number :"));

		if(n > 0)
		{
			int i = 1, sum = 0;

			
			do{
				sum = sum + i;
				i++;
			}while(i <= n);
			System.out.println("sum is :" + sum);

		}
		else
			System.out.println("Invalid input");

	}

}