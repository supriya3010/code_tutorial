import java.util.Stack;

public class Test_String {
	public static void main(String args[])
	{
		String s1="hello";
		String s2="hello";
		String s3="mkelo";
		String s4="hmllo";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		
		String s="my name is khan. im not a terrorist";
		System.out.println(s.replaceAll("//s", ""));
		
		Elder e= new Elder();
		Younger y=new Younger();
		System.out.println(e.msg);
		e.msg();
		y.msg();
		
		int a=25%10;
		int b=15%10;
		System.out.println(a);
		System.out.println(b);
		
		Stack<String> m1= new Stack<String>();
		m1.push("hello");
		m1.pop();
		System.out.println(m1.pop());
		
		
	}

}

class Elder
{
	final int msg=20;
	private String name="supriya";
	void msg()
	{
		System.out.println("im elder");
		System.out.println("name is "+name);
	}
}

class Younger extends Elder
{
	
	void msg()
	{
		System.out.println("accessing final variable of elder "+msg);
		//System.out.println("name is "+name); // no access to private member variables if class is overridden.
	}
	
}
