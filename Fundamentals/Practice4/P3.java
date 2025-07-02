import java.io.*;


class P3
{
	public static void main(String args[])
	{
		Console c = System.console();

		int n = Integer.parseInt(c.readLine("Enter the number of line:"));

		if(n>0)
		{
			int i = 1;
			do{
				int j = 1;
			
				do{
					System.out.print("* ");
					j++;

				}while(j<=i);
				System.out.println();
				i++;

			}while(i <= n);

		}
		else
			System.out.println("Invalid input");

	}

}