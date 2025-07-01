import java.io.*;

class P9
{
	public static void main(String args[])
	{
		Console c = System.console();

		int n = Integer.parseInt(c.readLine("Enter the number :"));

		if(n >= 0)
		{
			int i = 1, f = 1;
			do{
				f = f*i;
				i++;
			}while(i <= n);
			System.out.println("factorial :" + f);

		}
		else
			System.out.println("Invalid input");
	}

}