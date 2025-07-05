// C++ virtual base class conceptds,  Diamond prob

class Assignments extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Starting Assignments");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("Writing assignment " + i);
			try{Thread.sleep(3000);} catch(Exception e){}
		}
	}

}

class Songs extends Thread
{
	public void run()
	{
		System.out.println("Starting Songs");
		for(int i = 1; i <= 30; i++)
		{
			System.out.println("listening Song "+ i);
			try{Thread.sleep(1000);} catch(Exception e){}
		}
	}

}

class P5
{
	public static void main(String args[])
	{
		Assignments a = new Assignments();
		Thread t1 = new Thread(a);

		t1.start();

		Songs s = new Songs();
		Thread t2 = new Thread(s);
		
		t2.start();
	}

}