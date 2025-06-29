import java.io.*;

class P7
{
	public static void main(String args[])
	{
		Console c = System.console();

		double  amt_Doll = Double.parseDouble(c.readLine("Enter amount in $: "));
		double  amt_Rup = 86*amt_Doll;

		System.out.println("amount in ₹: " + amt_Rup);	//use chcp 65001

		

	}

}