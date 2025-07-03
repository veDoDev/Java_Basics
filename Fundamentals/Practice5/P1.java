import java.io.*;


class EvenOdd
{
	int num;

	EvenOdd(int num)
	{
		this.num = num;
	}

	void show()
	{
		System.out.println("num = " + num);
	}

	void check()
	{
		if(num%2 == 0)
			System.out.println("It is even");
		else
			System.out.println("It is odd");
	}

}


class P1
{
	public static void main(String args[])
	{
		Console c = System.console();

		int number = Integer.parseInt(c.readLine("Enter the number: "));

		EvenOdd e = new EvenOdd(number);

		e.show();
		e.check();	


	}
}