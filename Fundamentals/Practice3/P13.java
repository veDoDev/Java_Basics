import java.io.*;
import java.util.*;

class P13
{
	public static void main(String args[])
	{
		Console c = System.console();

		int n = Integer.parseInt(c.readLine("Enter the number of elements:"));

		if(n > 0)
		{
			String names[] = new String[n];
			
			for(int i = 0; i < n; i++)
				names[i] = c.readLine("Enter the element" + i + ": ");

			Arrays.sort(names); // to sort in reverse : add another param, Collections.reverseOrder()

			for(int i = 0; i < n; i++)
				System.out.println(names[i]);
			
		}
		else
			System.out.println("Invalid input");
	}

}