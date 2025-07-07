class P7
{
	public static void main(String args[])
	{
		System.out.println("Bhelcome");
		
		try{
			int num = Integer.parseInt(args[0]);
			String res = (num%2 == 0)?("even"):("odd");
			System.out.println("The number is " + res);
		}
		catch(NumberFormatException e){
			System.out.println("Please enter integers only");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter integers only");
		}

		System.out.println("Thank you");
	
	}


}