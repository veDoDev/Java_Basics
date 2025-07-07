class P11
{
	public static void main(String args[])
	{
		System.out.println("welcome");

		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
	
			if(b==0)
				throw new Exception("2nd integer should not be 0");
			
			int ans = a/b;
			System.out.println("a/b = " + ans);
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter integers only");
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}

}

//OAK