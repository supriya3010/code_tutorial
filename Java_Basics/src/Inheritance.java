
public class Inheritance {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.eat();
		Animal a2=new Dog();
		a2.eat();
		//a2.bark(); bark method is not defined in animal, C.T error
		try {
			/*
			 * Dog d1= (Dog)new Animal(); d1.eat(); d1.bark();
			 */
		try {
		Cat c1=(Cat)new Animal();
		c1.eat();
		c1.meow();
		}
		catch(Exception e)
		{
			System.out.println("im cat exception");
		}
		try
		{
		BabyDog b1=(BabyDog)new Dog();
		b1.bark();
		b1.eat();
		}
		catch(Exception e)
		{
			System.out.println("im babydog exception");
		}
		}
		catch(Exception e)
		{
			System.out.println("im dog exception");
		}
		Dog d2=new Dog();
		d2.eat();
		a1=d2;
		a1=(Dog)d2;
		a1.eat();
		
		Cat c1=new Cat();
		c1.eat();
		c1.meow();
		
		BabyDog b2=new BabyDog();
		d2=b2;
		d2.bark();
		d2.eat();
		
		

	}

}
//super class/parent class
class Animal
{
	void eat()
	{
		System.out.println("im inside animal");
	}
}
//sub class/child class
class Dog extends Animal
{
	void eat() {
		System.out.println("im inside dog");
	}
	void bark()
	{
		System.out.println("im barking");
	}
}
class Cat extends Animal
{
	void eat() {
		System.out.println("im inside cat");
	}
	void meow()
	{
		System.out.println("im meowin");
	}
}
class BabyDog extends Dog
{
	void eat() {
		System.out.println("im inside baby dog");
	}
	void bark()
	{
		System.out.println("im baby dog barking");
	}
}
