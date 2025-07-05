//------------------------------------------Concrete class--------------------------------------------------------
class Pappa
{
	public void md()
	{
		System.out.println("Maintainence bill, -> pappa will pay");
	}

	public void eb()			// concrete method
	{
		System.out.println("Electric bill, -> pappa will pay");
	}

}

class Deepak extends Pappa
{
	

}

class P1
{

	public static void main(String args[])
	{
		Deepak d = new Deepak();
		d.md();
		d.eb();
	}
}