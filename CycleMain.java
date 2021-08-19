//Assignment 7
// 2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// This program is for observing results for different scenarios.
class Cycle
{
}
class Unicycle extends Cycle
{
	void balance()
	{
		System.out.println("Unicyle balance method");
	}
}
class Bicycle extends Cycle
{
	void balance()
	{
		System.out.println("Bicyle balance method");
	}
}
class Tricycle extends Cycle
{
	
}
public class CycleMain
{
	public static void main(String args[])
	{
		Unicycle uc = new Unicycle();
		Bicycle bi = new Bicycle();
		Tricycle tri = new Tricycle();
		
		//creating cycle array
		Cycle c[] = new Cycle[3];
		
		//upcast the all cycle objects
		//java compiler automatically upcasts objects
		c[0] = uc;
		c[1] = bi;
		c[2] = tri;
		
		//calling balance method on each objects
		/*
		c[0].balance();
		c[1].balance();
		c[2].balance();
		this part will generate compile time error because Cycle class
		doesn't contain balance method.
		*/
		
		/*After down casting also it will generate error for Tricycle
		because it doesn't contain balance() method */
	}
}