package Pkg1;

public class Assesment2 {
public int Sum (int a,int b)
{
	int c;
	c= a+b;
	return c;
}
	public int Sub (int x,int y)
	{
		int z;
		z=x-y;
		return z;
	}
	public int Mul (int x1,int y1)
	{
		int z1;
		z1=x1*y1;
		return z1;	
	}
	public int Div (int a1,int b1)
	{
		int c1;
		c1=a1/b1;
		return c1;	
	}	
	public static void main(String[] args) {
		Assesment2 assm=new Assesment2();
		int e= assm.Sum(10, 2);
	  // System.out.println("the value of e "+e);
	  int d= assm.Sub(e, 2);
	  // System.out.println("the value of d " +d);
	     int f = assm.Sum(d, 2);
	   //  System.out.println("the value of f " +f);
	     int g = assm.Div(f, 2);
	     System.out.println("the value of final equation ((((10+2)-2)+2)/2) is " +g);    
	}
}
