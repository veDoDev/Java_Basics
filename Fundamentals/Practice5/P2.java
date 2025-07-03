import java.io.*;

class Circle
{
	double radius;
	
	Circle(double radius)
	{
		this.radius = radius;
	}

	void show()
	{
		System.out.println("radius = " + radius);
	}

	void area()
	{
		double area = 3.14*radius*radius;
		System.out.println("Area = " + area);
	}
	
	void circumference()
	{
		double cir = 2*3.14*radius;
		System.out.println("Circumference = " + cir);

	}

	void diameter()
	{
		double d = 2*radius;
		System.out.println("Diameter = " + d);

	}

}

class P2
{
	public static void main(String args[])
	{
		Console c = System.console();
	
		double r = Double.parseDouble(c.readLine("Enter the radius: "));

		if(r > 0)
		{
			Circle o = new Circle(r);

			o.show();
			o.area();
			o.circumference();
			o.diameter();
		
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}