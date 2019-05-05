package com.testjava.belajarsatu;

public class Main
{
	public String sa;
	Main()
	{
		
	}
	
	private void sayHi()
	{
			System.out.println("Hi World");
	}
	
	private void sayHi2()
	{
			System.out.println("Hi World2");
	}
	
	private void sayHi3()
	{
			System.out.println("Hi World3");
	}
	
	private void sayHi4()
	{
			System.out.println("Hi World4");
	}
	
	private void sayHi5()
	{
			System.out.println("Hi World5");
	}
	
	public static void main(String args[])
	{
		Main object = new Main();
		object.sayHi();
		object.sayHi2();
		object.sayHi3();
		object.sayHi4();
		object.sayHi5();
		
	}
	
	public static void main2(String args[])
	{
		Main object = new Main();
		object.sayHi2();
	}
}
