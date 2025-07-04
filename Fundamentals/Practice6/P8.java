//------------------------------------------------Method overriding-------------------------------------------------
class Rbi
{
	public void roi()
	{
		System.out.println("rbi --> rot - 3.5%");
	}

}
//----------------------------------------------------------------
class Icici extends Rbi
{
	public void roi()
	{
		System.out.println("Icici --> roi - 5.5%");
	}

}
//----------------------------------------------------------------
class Yes extends Rbi
{
	public void roi()
	{
		System.out.println("yes --> roi - 7.5%");
	}

}

//-------------------------------------------------------------------------------------------------------------------
class P8
{
	public static void main(String args[])
	{
		Icici c = new Icici();
		c.roi();

		Yes y = new Yes();
		y.roi();

	}

}