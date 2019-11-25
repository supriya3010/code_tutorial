
public class CopyConstructor {

	public static void main(String[] args) {
		MyObject m1=new MyObject();
		MyObject m2=new MyObject(m1);
		System.out.println("im m1 object " +m1.toString());
		System.out.println("im m2 object "+m2.toString());
	}

}
class MyObject
{
	String name;
	int id;
	MyObject()
	{
		System.out.println("im default constructor");
		name="Supriya";
		id=101;
	}
	MyObject(MyObject mo)
	{
		System.out.println("im copy constructor copying object");
		name=mo.name;
		id=mo.id;
	}
	public String toString()
	{
		return name+" "+id;
	}
}
