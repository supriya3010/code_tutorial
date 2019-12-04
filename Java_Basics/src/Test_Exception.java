import java.io.IOException;

public class Test_Exception {
	public  String validate(int age) throws InvalidAgeException1 
	{
		try {
			if(age<18) throw new InvalidAgeException1("invalid age exception");
			else
				System.out.println("age above 18");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "exception handled";
		}
		finally {
			System.out.println("inside finally of validate age");
		}
		return "invalid age handled";
		
	}
	public static void main(String args[]) throws InvalidAgeException1
	{
		//Parent p=new Child();
		//p.testParent();
		Test_Exception t=new Test_Exception();
		try {
		String s=t.validate(2);
		System.out.println(s);
		}
		catch(Exception e)
		{
			System.out.println("exception coz of invalid age");
		}
		try {
		String s=t.validate(18);
		System.out.println(s);
		}
		finally
		{
			System.out.println("im finally block");
		}
		//Test_Exception.validate(2);
		
	}
}
class InvalidAgeException1 extends Exception
{
	InvalidAgeException1(String s)
	{
		super();
		System.out.println(s);
	}
	
}
 class Parent  {
	void testParent() 
	{
	try {
	int a=10/0;
	}
	catch (ArithmeticException e)
	{
		System.out.println("divide by zero");
		e.printStackTrace();
	}
	}
}
 
 class Child extends Parent  {
	void testParent() throws ArithmeticException
	{
		//int a[]=new int[2]; a[5]=10; 
		/*
		 * try { int a[]=new int[2]; a[5]=10; } catch (Exception e) {
		 * System.out.println("array index out of bound"); e.printStackTrace(); }
		 */
	}
}