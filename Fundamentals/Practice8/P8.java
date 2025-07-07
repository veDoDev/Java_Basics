class P8
{
	public static void main(Integer args[])
	{
		System.out.println("Bhelcome");
		
		try{
			int num = args[0];
			String res = (num%2 == 0)?("even"):("odd");
			System.out.println("The number is " + res);
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter integers only");
		}
		System.out.println("Thank you");
	
	}


}