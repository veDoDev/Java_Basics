import java.util.*;

class P5
{
	public static void main(String args[])
	{
		System.out.println("Welcome");

		Scanner s = new Scanner(System.in);

		try{
			System.out.print("Enter num : ");
			double num = s.nextDouble();
			double res = Math.sqrt(num);
			System.out.println("The root is : " + res);
		}
		catch(InputMismatchException e){
			System.out.println("Please enter integers only");
		}
		catch(NoSuchElementException e){
			System.out.println("Please enter integers only");
		}

//--------------------------------------------------study this error-----------------------------------------------

		/*catch(InputMismatchException | NoSuchElementException e)
		{
			System.out.println("Please enter integers only");
		}*/		
		
		System.out.println("Thank you");
	
	}


}