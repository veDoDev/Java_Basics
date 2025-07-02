class P6
{
	public static void main(String args[])
	{
		String s1 = new String("kamal");
		

		String s2 = new String("Kamal classes borivali");
		String s3 = new String("kamal");
		
		System.out.println(s1+s2);
		System.out.println(s1 + " " + s2);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);		//checks the equality of reference pointers to the objects
		System.out.println(s1.equals(s3));	// checks the equality of the data of the objects
	}

}
