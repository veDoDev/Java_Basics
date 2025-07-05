abstract class Pappa 
{
	void mb()
	{
		System.out.println("Maintanence Bill, pappa will pay");
	}

	abstract void eb();

}


class Deepak extends Pappa
{
	public void eb()
	{
		System.out.println("Electric bill, Deepak will pay");
	}
}


class P2
{
	public static void main(String args[])
	{
		Deepak d = new Deepak();

		d.mb();
		d.eb();

	}

}