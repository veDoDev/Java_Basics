import java.io.*;

class Employee
{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void show()
	{
		System.out.println("ID = " + id);
		System.out.println("name = " + name);
		System.out.println("salary = " + salary);
	}

	public void payTax()
	{
		double amt = 0;
		if(salary < 50000)
			amt = salary*0.10;
		else
			amt = salary*0.05;
		
		System.out.println("Tax amount = " + amt);

	}
}

class HW1
{
	public static void main(String args[])
	{
		Console c = System.console();

		int n = Integer.parseInt(c.readLine("Enter the number of employees: "));
		Employee emp[] = new Employee[n];
		System.out.println("==============================");


		for(int i = 0; i < n; i++)
		{
			System.out.println("Employee " + (int)(i+1));
			int id = Integer.parseInt(c.readLine("Enter id: "));
			String name = c.readLine("Enter employee name : ");
			double salary = Double.parseDouble(c.readLine("Enter the salary of employee: "));
			emp[i] = new Employee(id, name, salary);
			System.out.println("-----------------------");

		}
	
		System.out.println("==============================");

		for(int i = 0; i < n; i++)
		{
			emp[i].show();
			emp[i].payTax();
			System.out.println("-----------------------");
		}
	
	}
}