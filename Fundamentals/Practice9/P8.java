import java.io.*;
import java.nio.file.*;


class P8
{
	public static void main(String args[]){
		Console c = System.console();
		try
		{
			String sfn = c.readLine("Enter the source file name: ");
			Path sp = Paths.get(sfn);
			if(Files.exists(sp))
			{
				String dfn = c.readLine("Enter destination file name: ");
				Path dp = Paths.get(dfn);
				if(Files.exists(dp))
				{
					System.out.println(dp + " already exists");
				}
				else
				{
					Files.copy(sp,dp);
					System.out.println("Data copied to " + dp);
				}
			}
			else	
				System.out.println("File DNE");
		}catch(IOException e){
			System.out.println("issue : " + e);
		}
		
	}

}