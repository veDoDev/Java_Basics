import java.io.*;

class P1
{
	public static void main(String args[])
	{
		System.out.println("Welcome");

		Console c = System.console();

		try{
			int num = Integer.parseInt(c.readLine("Enter num : " ));
			String res = (num%2 == 0)?("even"):("odd");
			System.out.println("The number is " + res);
		}
		catch(NumberFormatException e){
			System.out.println("Please enter integers only");
		}
		System.out.println("Thank you");
	
	}


}