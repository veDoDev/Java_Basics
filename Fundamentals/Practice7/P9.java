import java.io.*;


class Square implements Runnable
{

	private int num;

	public Square(int num)
	{
		this.num = num;

	}

	@Override
	public void run()
	{
		Console c = System.console();
		System.out.println("Squaring 1 to " + num);
		for(int i = 1; i <= num; i++)
		{
			System.out.println("Square of " + i + "= " + i*i);
			try{Thread.sleep(3000);} catch(Exception e){}
		}
	}

}

class Cube implements Runnable
{
	private int num;

	public Cube(int num)
	{
		this.num = num;
	}


	public void run()
	{
		Console c = System.console();
		System.out.println("Cubing 1 to " + num);
		for(int i = 1; i <= num; i++)
		{
			System.out.println("Cube of "+ i +" = " + i*i*i);
			try{Thread.sleep(1000);} catch(Exception e){}
		}
	}

}

class P9
{
	public static void main(String args[])
	{

		Console c = System.console();
		int num1 = Integer.parseInt(c.readLine("Enter the number (square) : "));
		

		Square s = new Square(num1);
		Thread t1 = new Thread(s);

		t1.start();

		int num2 = Integer.parseInt(c.readLine("Enter the number (cube): "));

		Cube cu = new Cube(num2);
		Thread t2 = new Thread(cu);
		
		t2.start();
	}

}//cathie CR OCJ