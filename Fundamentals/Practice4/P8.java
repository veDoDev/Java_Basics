import java.io.*;
import java.util.*;


class P8
{
	public static void main(String args[])
	{
		Console c = System.console();
		
		String name = new String(c.readLine("Enter name: "));
		char ch[] = name.toCharArray();

		Arrays.sort(ch);
		
		name = new String(ch);

		System.out.println(name);
	}

}

