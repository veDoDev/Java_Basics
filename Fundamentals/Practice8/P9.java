class P9
{
	public static void main(String args[])
	{
		System.out.println("Bhelcome");
		
		try{
			int num = Integer.parseInt(args[0]);
			double res = Math.sqrt(num);
			System.out.println("The number is " + res);
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter integers only");
		}
		System.out.println("Thank you");
	
	}


}