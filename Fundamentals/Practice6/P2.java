import java.io.*;

class Person
{

	private int id;
	private String name;
	private String addr;

	public Person(int id, String name, String addr)
	{
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
		
	public void show()
	{
		System.out.println("ID = " + id);
		System.out.println("Name = " + name);
		System.out.println("Address = " + addr);

	}
}

class Student extends Person
{
	private int marks;
	
	public Student(int id, String name, String addr, int marks)
	{
		super(id, name, addr);
		this.marks = marks;
	}

	public void show()
	{
		super.show();
		System.out.println("Marks = " + marks);
	}
}


class P2
{
	public static void main(String args[])
	{
		Person p1 = new Person(1, "Walter White", "Larkview");

		p1.show();

		Student s1 = new Student(21, "Kris", "Vrindavan", 99);

		s1.show();
	}
}
