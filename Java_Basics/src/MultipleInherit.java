
public class MultipleInherit {

	public static void main(String[] args) {
		Shape s1=new Shape();
		s1.draw();
		Shape.staticEat();
		Shape s2=new Rect();
		s2.draw();
		Shape s3=new Circle();
		s3.draw();
		Rect.staticEat();
		Circle.staticEat();
		Animal l1=new Lion();
		l1.eat();
		Lion l2=new Lion();
		l2.eat();
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());

	}

}
class Shape
{
	void draw()
	{
		System.out.println("im draw shape");
	}
	static void staticEat()
	{
		System.out.println("im static method eat");
	}
}
class Lion extends Animal
{
	void eat()
	{
	System.out.println("im inside lion");
	}
}
class Rect extends Shape
{
	void eat()
	{
	System.out.println("im inside rect");
	}
	void draw()
	{
		System.out.println("draw rectangle");
	}
	static void staticEat()
	{
		System.out.println("im static method eat in rect");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("draw circle");
	}
	static void staticEat()
	{
		System.out.println("im method eatin circle");
	}
}
