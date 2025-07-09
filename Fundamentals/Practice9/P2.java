import java.io.*;
import java.nio.file.*;

class P2
{
	public static void main(String args[])
	{
		Console c = System.console();
		String fn = c.readLine("Enter file name: ");
		Path p = Paths.get(fn);
		
		if(Files.exists(p))
			System.out.println(fn+" already exits");
		else
		{
			try{
				Files.createFile(p);
				System.out.println(fn+" created");
			}
			catch(NoSuchFileException e)
			{
				System.out.println("Check folder name");
			}
			catch(AccessDeniedException e)
			{
				System.out.println("Check folder persmissions");
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
			System.out.println("Thank you");
		}
		
	}
}