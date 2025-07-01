import java.io.*;

class P12
{
	public static void main(String args[])
	{
		Console c = System.console();

		int n = Integer.parseInt(c.readLine("Enter the number of elements:"));

		if(n > 0)
		{
			int nums[] = new int[n];
			
			for(int i = 0; i < n; i++)
				nums[i] = Integer.parseInt(c.readLine("Enter the element" + i + ": "));

			int sum = 0;
			for(int i = 0; i < n; i++)
				sum = sum + nums[i];
			System.out.println("sum = " + sum);
		}
		else
			System.out.println("Invalid input");
	}

}