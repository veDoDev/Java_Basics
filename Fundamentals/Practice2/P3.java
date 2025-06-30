//wajp to wish GA/GM/GE

import java.io.*;
import java.time.*;

class P3
{
	public static void main(String args[])
	{
		Console c = System.console();

		String name = c.readLine("Enter your name: ");

		LocalTime t = LocalTime.now();

		int hr = t.getHour();

		if(hr < 12)	
			System.out.println("Good morning " + name);
		else if(hr < 16)
			System.out.println("Good afternoon " + name);
		else
			System.out.println("Good evening " + name);


	}

}