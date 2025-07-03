import java.io.*;

class Student
{

	private int rno;
	private String name;
	private double marks;

	public Student(int rno, String name, double marks)
	{
		this.rno = rno;
		this.name = name;
		this.marks = marks;

	}


	public void show()
	{
		System.out.println("Roll number = " + rno);
		System.out.println("name = " + name);
		System.out.println("marks = " + marks);
	}

	public void findGrade()
	{
		if(marks > 80)
			System.out.println("Grade A");
		else if(marks > 60)
			System.out.println("Grade B");
		else	
			System.out.println("Grade C");
	}

}

class P4
{
	public static void main(String args[])
	{
		Console c = System.console();
			
		int roll = Integer.parseInt(c.readLine("Enter the roll number : "));
		double marks = Double.parseDouble(c.readLine("Enter the marks : "));
		String name = c.readLine("Enter the name : ");

		Student stu = new Student(roll, name, marks);
		

		stu.show();
		stu.findGrade();
	}

}