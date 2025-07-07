import java.util.*;

class P4
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		try{
			System.out.print("Enter num : ");
			int num = s.nextInt();
			String res = (num%2 == 0)?("even"):("odd");
			System.out.println("The number is " + res);
		}
		catch(InputMismatchException e){
			System.out.println("Please enter integers only");
		}

		System.out.println("Welcome");
		System.out.println("Thank you");
	}

}