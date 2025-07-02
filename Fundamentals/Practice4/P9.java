import java.io.*;
import java.util.*;


class P9
{
	public static void main(String args[])
	{
		Console c = System.console();
				
		String str1 = new String(c.readLine("Enter string 1: "));
		String str2 = new String(c.readLine("Enter string 2: "));

		char chArr1[] = str1.toCharArray();
		char chArr2[] = str2.toCharArray();

		Arrays.sort(chArr1);
		Arrays.sort(chArr2);

		str1 = new String(chArr1);
		str2 = new String(chArr2);

		if(str1.equals(str2))
			System.out.println("They are anagrams !!");
		else
			System.out.println("They aren't anagrams");
	}

}


