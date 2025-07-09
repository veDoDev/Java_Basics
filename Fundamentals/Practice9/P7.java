import java.io.*;
import java.nio.file.*;


class P7
{
	public static void main(String args[])
	throws IOException{
		Console c = System.console();
		String fn = c.readLine("Enter file to be deleted: ");
		Path p = Paths.get(fn);
		
		if(Files.exists(p))
		{
			try{
				BufferedReader br = Files.newBufferedReader(p);
				String line = br.readLine();
				while(line != null)
				{
					System.out.println(line);
					line = br.readLine();

				}
			}catch(IOException e){
				System.out.println("issue " + e);
			}
		}
			
		else
			System.out.println(fn + " DNE");
		
	}

}