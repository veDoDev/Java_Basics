//-----------------------------------------------------Method overloading-----------------------------------

class A
{
	public void compute(double num)//						 method 1 
	{
		System.out.println("square = " + (num * num));
	}

	public void compute(double n1, double n2)
	{
		System.out.println("Addition = " + (n1+n2));//				 method 2
	}
}
//										both the methods have same name but 
//										different task
class P4
{
	public static void main(String args[])
	{
		A a = new A();

		a.compute(3);
		a.compute(3,4);
	}

}