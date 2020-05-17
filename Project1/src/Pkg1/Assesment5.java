package Pkg1;

import java.nio.charset.MalformedInputException;

public class Assesment5 {

	public void Assesment5()
	{
		
		System.out.println("Default method");
		
}
	public void Assesment5(int a)
	{
		System.out.println("1 Parametrized method");
	}
	public void Assesment5(int a,int b)
	{
		this.Assesment5(2,3,1);
		this.Assesment5();
		this.Assesment5(9);
		this.Assesment5(4,5,6,7);
		
		System.out.println("2 Parametrized method");
	}
	public void Assesment5(int a,int b,int c)
	{
		
		System.out.println("3 Parametrized method");
	//this.Assesment5();
	//this.Assesment5(2,3);
		
	}
	public void Assesment5(int a,int b,int c,int d)
	{
		System.out.println("4 Parametrized method");
	}
	public static void main(String[] args) {
		Assesment5 perm = new Assesment5();
		perm.Assesment5(2,3);
	}
	
		
	
}
