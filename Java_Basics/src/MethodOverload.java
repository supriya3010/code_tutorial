
public class MethodOverload {
	public static void main(String args[])
	{
		String args1[]= {"supriya","lucky"};
		Integer args2[]= {1,2,3};
		/* Overload o= new Overload(); */
		Overload.main();
		Overload.main(args1);
		SubOverload s=new SubOverload();
		SubOverload.main();
		SubOverload.main(args2);
		s.add(20, 20);
		s.add(20, 20.0);
		//s.add(20.0, 20.0);
		Overload.add(20.0, 20.0);
		Overload.add(20.0,20);
		
		
	}

}

abstract class Overload
{
	static void main() {
		System.out.println("im overriding main method");
	}
	static void main(String args[])
	{
		System.out.println("im overriding main");
	}
	//abstract public static void add(int x,int y); as static means you need to have a functionality,
	// whereas abstract methods needs implementation and cannot have body so abstract methods 
	//cannot be static
	abstract void add(int x,int y);
	abstract void add(int x,double y);
	//abstract void add(double x,double y);
	static void add(double x,int y)
	{
		System.out.println("im double,integer");
		System.out.println(x+y);
	}
	static void add(double x,double y)
	{
		System.out.println("im double");
		System.out.println(x+y);
	}
	
}
class SubOverload extends Overload
{
	static void main(Integer args[]) {
		System.out.println("im integer overriding main method");
	}
	static void main(String args[])
	{
		System.out.println("im overriding main in overload");
	}
	@Override
	void add(int x, int y) {
		System.out.println("im integer args");
		System.out.println(x+y);
		
	}
	@Override
	void add(int x, double y) {
		System.out.println("im integer, double");
		System.out.println(x+y);
		
	}
	/*
	 * @Override void add(double x, double y) { System.out.println(x+y);
	 * 
	 * }
	 */
}
