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
			try{
				BufferedWriter fw = Files.newBufferedWriter(p);
				PrintWriter pw = new PrintWriter(fw);
				String data = c.readLine("Enter data to write: ");
				pw.println(data);
				pw.close();
			}catch(IOException e){
				System.out.println("issue " + e);
			}
		}
			
		else
			System.out.println(fn + " DNE");
		
	}

}