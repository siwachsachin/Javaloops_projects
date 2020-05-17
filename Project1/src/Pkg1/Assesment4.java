package Pkg1;

public class Assesment4 {
	
	public Assesment4()
	{
	this(1,5,6,7);
				System.out.println("This is default Constructor");
	}
    public Assesment4(int a)
    {
    	this();
    	System.out.println("This is 1 Parametrized Constructor");
    }
    public Assesment4(int a,int b)
    {
    	this(1,2,3);
    	System.out.println("This is 2 Parametrized Constructor ");
    }
    public Assesment4(int a, int b,int c)
    {
    	this(1);
    	System.out.println("This is 3 Parametrized Constructor ");
    }
    public Assesment4(int a, int b,int c,int d)
    {
    
    	System.out.println("This is 4 Parametrized Constructor ");
    }
    public static void main(String[] args) {
		Assesment4 Cons = new Assesment4(2,3);
		
	}
}
