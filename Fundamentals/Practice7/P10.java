import java.io.*;


class Vowels implements Runnable
{

	private String name;

	public Vowels(String name)
	{
		this.name = name.toLowerCase();;

	}

	@Override
	public void run()
	{
		int n = name.length(), counter = 0;
		for(int i = 0; i < n; i++)
		{
			char ch = name.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			{
				counter++;
			}
			//try{Thread.sleep(3000);} catch(Exception e){}
		}
		System.out.println(counter);
	}

}

class P10
{
	public static void main(String args[])
	{

		Console c = System.console();
		String nam = c.readLine("Enter String : ");
		

		Vowels s = new Vowels(nam);
		Thread t1 = new Thread(s);

		t1.start();
	}

}//cathie CR OCJ