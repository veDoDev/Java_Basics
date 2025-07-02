import java.io.*;

class P7
{
	public static void main(String args[])
	{
		Console c = System.console();
		
		String username = new String(c.readLine("Enter username: "));
		String password = new String(c.readLine("Enter password: "));

		if((username.equals("kamal"))&&(password.equals("classes")))
			System.out.println("Logged in !");
		else
			System.out.println("Invalid Credentials!!");

	}

}

class P8
{
	public static void main(String args[])
	{
		Console c = System.console();
		
		String username = new String(c.readPassword("Enter username: "));
		String password = new String(c.readPassword("Enter password: "));

		if((username.equals("kamal"))&&(password.equals("classes")))
			System.out.println("Logged in !");
		else
			System.out.println("Invalid Credentials!!");

	}

}