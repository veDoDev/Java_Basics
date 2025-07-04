//-------------------------------------------------Method Overriding---------------------------------------------

class A
{
	public void compute(double num)
	{
		System.out.println("Square = " + (num*num));
	}
}

class B extends A
{
	public void compute(double num)
	{
		System.out.println("Square root = " + Math.sqrt(num));

	}

}
//-----------------------------------------------------------------
class P5
{
	public static void main(String args[])
	{
		A a = new A();
		a.compute(4);

		B b = new B();
		b.compute(4);

	}


}