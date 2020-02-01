package com.hdfc.loans.carloans;

public class SecondClass 
{ 	int a=10, b=20, c;  //properties
	
	public void add()
	{
		c=a+b;
		System.out.println("Addition of a and b=" + c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println("Subtraction of a and b=" + c);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hi My name is Upama");
		SecondClass obj=new SecondClass();
		obj.add();
		obj.sub();
		System.out.println(obj.c);
		
		SecondClass obj1= new SecondClass();
		obj.add();
		obj.sub();
		
	}
}
