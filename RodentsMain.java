//Assignment-7
// 1. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster.
abstract class Rodent
{
	Rodent()
	{
		System.out.println("Hello, I am Rodent");
	}
	abstract void eat();
	abstract void run();
}
class Mouse extends Rodent
{
	Mouse()
	{
		//JVM places super(), so it calls super class constructor
		System.out.println("Hello, I am mouse");
	}
	@Override
	void eat()
	{
		System.out.println("Mouse is eating");
	}
	@Override
	void run()
	{
		System.out.println("Mouse is running");
	}
}
class Gerbil extends Rodent
{
	Gerbil()
	{
		//JVM places super(), so it calls super class constructor
		System.out.println("Hello, I am Gerbil");
	}
	@Override
	void eat()
	{
		System.out.println("Gerbil is eating");
	}
	@Override
	void run()
	{
		System.out.println("Gerbil is running");
	}
}
class Hamster extends Rodent
{
	Hamster()
	{
		//JVM places super(), so it calls super class constructor
		System.out.println("Hello, I am Hamster");
	}
	@Override
	void eat()
	{
		System.out.println("Hamster is eating");
	}
	@Override
	void run()
	{
		System.out.println("Hamster is running");
	}
}
public class RodentsMain
{
	public static void main(String args[])
	{
		Rodent arr[] = new Rodent[3];
		
		arr[0] = new Gerbil();
		arr[1] = new Hamster();
		arr[2] = new Mouse();
		
		arr[0].eat(); //Gerbil eat method will be called
		arr[0].run(); //Gerbil run method will be called
 
		arr[1].eat(); //Hamster eat method will be called
		arr[1].run(); //Hamster run method will be called
 
		arr[2].eat(); //Mouse eat method will be called
		arr[2].run(); //Mouse run method will be called
	}
}