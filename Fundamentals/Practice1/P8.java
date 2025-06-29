import java.io.*;

class P8
{
	public static void main(String args[])
	{
		Console c = System.console();

		double  amt_Rup = Double.parseDouble(c.readLine("Enter amount in ₹: "));
		double  amt_Doll = amt_Rup/86;

		System.out.println("amount in $: " + amt_Rup);

		

	}

}