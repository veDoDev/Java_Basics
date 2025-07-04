import java.io.*;

class Student 
{

	private static String prof_name = "kamal sir";
	// static hai matlab sharable hai

	private int rno;
	private String name;
	private int marks;
	//static nahi hai matlab sharable nahi hai (sabke liye unique hai)

	public Student(int rno, String name, int marks)
	{
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}

	public void show()
	{
		System.out.println(rno + "\t|" + name + "\t|" + marks + "\t|prof = " + prof_name);
	}
		
}

class P1
{
	public static void main(String args[])
	{
		Console c = System.console();

		Student s1 = new Student(10, "walter", 34);
		Student s2 = new Student(00, "Donna", 43);
		Student s3 = new Student(01, "Harvey", 33);


		s1.show();
		s2.show();
		s3.show();
	}


}