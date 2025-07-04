//----------------------------------------------------Method Overloading--------------------------------
class MedicalShop
{
	public void discount(double amt)
	{
		double finalAmt = amt*0.9;
		System.out.println("final amount : " + finalAmt);
	}

	public void discount(double amt, double percentage)
	{
		double finalAmt = amt * (1 - percentage/100);
		System.out.println("final amount : " + finalAmt);
	}


}

//------------------------------------------------------------------
class P6
{
	public static void main(String args[])
	{
		MedicalShop ms = new MedicalShop();

		ms.discount(100);
		ms.discount(100,15);
	}

}