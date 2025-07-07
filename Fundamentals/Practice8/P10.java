class P10
{
	public static void main(String args[])
	{
		System.out.println("Welcome");
		

		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			int res = a/b;
			System.out.println("a/b = " + a/b);
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter integers only");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Infinity");
		}
		

		System.out.println("Thank you");
	}

}