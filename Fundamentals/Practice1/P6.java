import java.io.*;

class P6
{
	public static void main(String args[])
	{
		Console c = System.console();
		
		double length = Double.parseDouble(c.readLine("Enter the length :"));	//Double is no Trouble
		double breadth = Double.parseDouble(c.readLine("Enter the breadth :"));

		double area = length*breadth;
		double perimeter = 2*(length + breadth);

		System.out.println("area = " + String.format("%.2f",area));
		System.out.println("perimeter = " + String.format("%.2f",perimeter));

	}
}