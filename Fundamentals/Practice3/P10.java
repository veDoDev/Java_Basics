import java.io.*;

class P10
{
	public static void main(String args[])
	{
		Console c = System.console();

		int n = Integer.parseInt(c.readLine("Enter the number :"));

		if(n >= 0)
		{
			int i = 1, f = 1;
			while(i <= n)
			{
				f = f*i;
				i++;
			}
			System.out.println("factorial :" + f);

		}
		else
			System.out.println("Invalid input");
	}

}