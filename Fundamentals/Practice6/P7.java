//-------------------------------------------------Method overloading (self) ----------------------------------------
class Compute
{
	public void area(double radius)
	{
		double area = 3.14*radius*radius;
		System.out.println("Area of circle : " + area);
	}
		
	public void area(double length, double breadth)
	{
		double area = length*breadth;
		System.out.println("Area of rectangle : " + area);
	}

}
//-------------------------------------------------------------------
class P7
{
	public static void main(String args[])
	{
		Compute c = new Compute();

		c.area(4.5);
		c.area(4,5);
	}

}