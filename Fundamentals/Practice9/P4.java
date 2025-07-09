//Delete an existing file 


import java.io.*;
import java.nio.file.*;


class P4
{
	public static void main(String args[])
	throws IOException{
		Console c = System.console();
		String fn = c.readLine("Enter file to be deleted: ");
		Path p = Paths.get(fn);
		
		if(Files.exists(p))
		{
			Files.delete(p);
			System.out.println(fn + " deleted");
		}
			
		else
			System.out.println(fn + " DNE");
		
	}

}