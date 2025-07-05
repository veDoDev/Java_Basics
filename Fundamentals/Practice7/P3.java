abstract class Pappa
{
	abstract void mb();

	abstract void eb();

}

class Deepak extends Pappa
{
	public void mb()
	{
		System.out.println("Maintanence Bill, Deepak will pay");

	}
	
	public void eb()
	{
		System.out.println("Electric Bill, Deepak will pay");
	}

}

class P3
{
	public static void main(String args[])
	{
		Deepak d = new Deepak();
	
		d.mb();
		d.eb();
	}

}