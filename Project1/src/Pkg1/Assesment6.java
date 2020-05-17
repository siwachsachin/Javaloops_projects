package Pkg1;
import java.util.Scanner;

public class Assesment6 {
public int sum(int a, int b)
{
	int c;
	c=a+b;
	return c;
}
	public int sub(int a1, int b1)
	{
		int c1;
		c1= a1-b1;
		return c1;
	}
	public int mul(int a2, int b2)
	{
		int c2;
		c2=a2*b2;
		return c2;
	}
	public void div(int a3, int b3)
	{
		int c3;
		c3 = a3/b3;
		System.out.println("Final result is "
				+ "" +c3);
	}
	public static void main(String[] args) {
		System.out.println("Please enter value of a");
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Value of a is " +a);
		
		System.out.println("Please enter value of b is");
		int b = s.nextInt();
		System.out.println("Value of b is " +b);
		
		System.out.println("Please enter value of c");
		int c = s.nextInt();
		System.out.println("Value of a is " +c);
		
		System.out.println("Please enter value of d is");
		int d = s.nextInt();
		System.out.println("Value of d is " +d);
		
		System.out.println("Please enter value of e");
		int e = s.nextInt();
		System.out.println("Value of e is " +e);
		
		System.out.println("Please enter value of f is");
		int f = s.nextInt();
		System.out.println("Value of f is " +f);
		Assesment6 s1= new Assesment6();
		int x1= s1.sum(a, b);
		int x2 = s1.sub(x1, c);
		int x3= s1.sum(x2, d);
		int x4= s1.mul(x3, e);
		s1.div(x4, f);
	//s	System.out.println("The final expression" +c3);
	}
	
}
