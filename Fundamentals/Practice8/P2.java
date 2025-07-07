import java.io.*;

class P2
{
	public static void main(String args[])
	{
		System.out.println("Welcome");

		Console c = System.console();
		try{
			double num = Double.parseDouble(c.readLine("Enter number: "));
			double res = Math.sqrt(num);
			System.out.println("The root is : " + res);
		}
		catch(NumberFormatException e){
			System.out.println("Please enter integers only");
		}
		
		
		System.out.println("Thank you");
	
	}


}