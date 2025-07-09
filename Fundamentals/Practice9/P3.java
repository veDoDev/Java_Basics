import java.io.*;
import java.nio.file.*;


class P3
{
	public static void main(String args[])
	throws IOException{
		Console c = System.console();
		String fn = c.readLine("Enter file name: ");
		Path p = Paths.get(fn);
		
		if(Files.exists(p))
			System.out.println(fn + " already exists");
		else
		{
			Files.createFile(p);
			System.out.println(fn + " created");
		}
	}

}