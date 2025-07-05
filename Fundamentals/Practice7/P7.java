class Square extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Squaring 1 to 10");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("Square of " + i + "= " + i*i);
			try{Thread.sleep(3000);} catch(Exception e){}
		}
	}

}

class Cube extends Thread
{
	public void run()
	{
		System.out.println("Cubing 1 to 10");
		for(int i = 1; i <= 30; i++)
		{
			System.out.println("Cube of "+ i +" = " + i*i*i);
			try{Thread.sleep(1000);} catch(Exception e){}
		}
	}

}

class P7
{
	public static void main(String args[])
	{
		Square s = new Square();
		Thread t1 = new Thread(s);

		t1.start();

		Cube c = new Cube();
		Thread t2 = new Thread(c);
		
		t2.start();
	}

}