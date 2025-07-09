import java.io.*;
import java.nio.file.*;

class P1
{
	public static void main(String args[])
	{
		Console c = System.console();
		String fn = c.readLine("Enter file name: ");
		Path p = Paths.get(fn);
		
		if(Files.exists(p))
			System.out.println(fn + " exists");
		else
			System.out.println(fn + " does not exits");
	}

}