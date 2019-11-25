
public class ThisKeyword {

	public static void main(String[] args) {
		Test m1=new Test(101,"suppu");
		Test m2=new Test(102,"priya");
		//Test m3=new Test();
		System.out.println(m1.name+" "+m1.id);
		System.out.println(m2.name+" "+m2.id);
		m1.method();
		m1.callMethod();

	}
}

class Test
{
	int id;
	String name;

	/* without this keyword
	 * Test(int id,String name) { id=id; name=name; }
	 */
	Test(int id,String name) 
	{ 
		//this();
		this.id=id; this.name=name; 
		}
	
	Test()
	{
		this(102,"rama");
		System.out.println("default construtor");
	}
	
	void callMethod()
	{
		System.out.println("im inside call method");
		this.method();
	}
	
	void method()
	{
		System.out.println("im inside method");
	}

}
