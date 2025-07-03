import java.io.*;

class Rectangle
{
	private double length;
	private double breadth;

	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void show()
	{
		System.out.println("Length = " + length);
		System.out.println("Breadth = " + breadth);

	}

	public void area()
	{
		double area = length*breadth;

		System.out.println("Area = " + area);
	}
	
	public void perimeter()
	{
		double peri = 2*(length + breadth);

		System.out.println("Perimeter = " + peri);
	}
}

class P3
{

	public static void main(String args[])
	{
		Console c = System.console();

		double length = Double.parseDouble(c.readLine("Enter the length: "));
		double breadth = Double.parseDouble(c.readLine("Enter the breadth: "));

		if((length > 0)&&(breadth > 0))
		{

			Rectangle r = new Rectangle(length, breadth);

			r.show();
			r.area();
			r.perimeter();

		}
		else
			System.out.println("Invalid metrics !");
			

	}


}