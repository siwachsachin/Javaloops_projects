package Pkg1;

public class Student {
	int age , roll_num;
	public void display1()
	{
		System.out.println("Welcome all");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] arg)
	{
		Student Sachin=new Student();
		Sachin.age=30;
		System.out.println(Sachin.age);
		Sachin.roll_num= 12345;
		System.out.println(Sachin.roll_num
				);
		Sachin.display1();
		Sachin.display2();
	}

	
}
