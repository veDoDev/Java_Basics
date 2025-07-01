import java.io.*;

class P11
{
	public static void main(String args[])
	{
		Console c = System.console();

		int n = Integer.parseInt(c.readLine("Enter the number :"));

		if(n >= 0)
		{
			int f = 1;
			for(int i = 1; i <= n; i++)
			{
				f = f*i;
			}
			System.out.println("factorial :" + f);

		}
		else
			System.out.println("Invalid input");
	}

}