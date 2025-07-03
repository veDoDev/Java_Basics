import java.io.*;

class Account
{
	private int acc_no;
	private String name;
	private double balance;

	public Account(int acc_no, String name, double balance)
	{
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
	}
	
	public void show()
	{
		System.out.println("Account number : " + acc_no);
		System.out.println("name : " + name);
		System.out.println("Balance : " + balance);
	}

	public void deposit()
	{
		Console c = System.console();
		double amount = Double.parseDouble(c.readLine("Enter the amount to be deposited : "));

		balance += amount;
		System.out.println("The current balance becomes : " + balance);

	}

	public void withdraw()
	{
		Console c = System.console();
		double amount = Double.parseDouble(c.readLine("Enter the amount you want to withdraw : "));

		if(balance < amount)
			System.out.println("Insufficient Balance");
		else
		{
			balance = balance - amount;
			System.out.println("The current balance is : " + balance);

		}

	}

}


class P5
{
	public static void main(String args[])
	{
		Console c = System.console();


		int acc_n = Integer.parseInt(c.readLine("Enter the account number: "));

		String name = c.readLine("Enter the name of user: ");
		double balance = Double.parseDouble(c.readLine("Enter the balance : "));

		Account acc = new Account(acc_n, name, balance);

		acc.show();
		acc.deposit();
		acc.withdraw();

	}

}