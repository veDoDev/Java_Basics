import java.util.*;

class P6
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome");
		

		try
		{
			System.out.print("Enter a: ");
			int a = s.nextInt();
			System.out.print("Enter b: ");
			int b = s.nextInt();

			int res = a/b;
			System.out.println("a/b = " + a/b);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter integers only");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("infinity");
		}
		

		System.out.println("Thank you");
	}

}