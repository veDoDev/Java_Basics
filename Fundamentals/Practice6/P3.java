import java.io.*;
//-----------------------------------------------------class 1 -------------------------------------------
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
//-----------------------------------------------------class 2 ----------------------------------------------------

class Teacher extends Person {
    private int salary;

    public Teacher(int id, String name, String addr, int salary) {
        super(id, name, addr);
        this.salary = salary;
    }

    public void show() {
        super.show();
        System.out.println("Salary = " + salary);
    }
}
//-----------------------------------------------------class 3 ----------------------------------------------------

class HOD extends Teacher
{

	private String dept;
	
	public HOD(int id, String name, String addr, int salary, String dept)
	{
		super(id,name,addr,salary);

		this.dept = dept;

	}

	public void show()
	{
		super.show();
		System.out.println("Dept = " + dept);

	}
}
//-----------------------------------------------------main class--------------------------------------------------

class P3 {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Walter White", "Larkview");
        p1.show();

        Teacher t1 = new Teacher(21, "Kanishk", "Vrindavan", 10000);
        t1.show();

	HOD h1 = new HOD(02, "Nilesh", "Borivali", 2500000, "CG");
	h1.show();
    }
}