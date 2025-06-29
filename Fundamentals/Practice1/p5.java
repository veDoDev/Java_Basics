import java.io.*;

class p5
{
	public static void main(String args[])
	{
		Console c = System.console();
		
		double radius = Double.parseDouble(c.readLine("Enter the radius : "));

		double area = 3.14*radius*radius;
		double circum = 2*3.14*radius;

		System.out.println("area = " + String.format("%.2f",area));
		System.out.println("circumference = " + String.format("%.2f",circum));

	}
}