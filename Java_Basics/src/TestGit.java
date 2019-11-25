import java.io.IOException;

public class TestGit {
	static void validateAge(int age) throws invalidAgeException
	{
		if(age<18)
			throw new invalidAgeException("not valid");  
	     else  
	      System.out.println("welcome to vote");
	}
	public static void main(String args[]) throws IOException
	{
		try {
			validateAge(13);
		} catch (invalidAgeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try
		{
			/*
			 * int a=10/0; System.out.println(a);
			 */
		System.out.println("hello inside try");
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("null string no length");
		}
		try {
			int y[]=new int[5];
			y[5]=10;
			System.out.println(y[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("trying to access wrong element in array");
		}
		}
		//catch(Exception e) { System.out.println(e); }
		  catch(NullPointerException e) { System.out.println(e); }
		catch(Exception e) { System.out.println(e);
		System.out.println("cannot divide by zero");}
		 
		finally
		{
			System.out.println("hello im finally");
		}
		System.out.println("im out of try catch");
		TestThrow t=new TestThrow();
		t.method(10);
		t.validate(4);
		t.throwsMethod(12);
		
	}

}
class invalidAgeException extends Exception
{
	invalidAgeException(String s)
	{
	super(s);
	}
}
class TestThrow 
{
	void method(int x) throws ArithmeticException
	{
		try {
		System.out.println(x/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void throwsMethod(int x) throws IOException
	{
		throw new IOException("im io exception");
	}
	void validate(int age)
	{
		if(age<18) throw new NumberFormatException("invalid age");
		else
			System.out.println("valid age to vote");
	}
}
