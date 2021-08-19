//Assignment 7
/*3. Create three interfaces, each with two methods.
 Inherit a new interface that combines the three, adding a new method. 
 Create a class by implementing the new interface 
 and also inheriting from a concrete class.*/

interface One
{
	void oneDisplay();
	void oneGreetings();
}
interface Two
{
	void twoDisplay();
	void twoGreetings();
}
interface Three
{
	void threeDisplay();
	void threeGreetings();
}
interface Four extends One,Two,Three
{
	void fourDisplay();
}
class InterfaceTest extends InterfaceMain implements Four
{
	public void oneDisplay()
	{
		//Empty implementation to satisfy compiler.
	}
	public void oneGreetings()
	{
		//Empty implementation to satisfy compiler.
	}
	public void twoDisplay()
	{
		//Empty implementation to satisfy compiler.
	}
	public void twoGreetings()
	{
		//Empty implementation to satisfy compiler.
	}
	public void threeDisplay()
	{
		//Empty implementation to satisfy compiler.
	}
	public void threeGreetings()
	{
		//Empty implementation to satisfy compiler.
	}
	public void fourDisplay()
	{
		//Empty implementation to satisfy compiler.
	}
	
	//four methods, each of which takes one of 
	//the four interfaces as an argument
	void oneTest(One obj)
	{
		System.out.println("Inside oneTest() method");
	}
	void twoTest(Two obj)
	{
		System.out.println("Inside twoTest() method");
	}
	void threeTest(Three obj)
	{
		System.out.println("Inside threeTest() method");
	}
	void fourTest(Four obj)
	{
		System.out.println("Inside fourTest() method");
	}
}
public class InterfaceMain
{
	public static void main(String[] ags)
	{
		InterfaceTest obj = new InterfaceTest();
		obj.oneTest(obj);
		obj.twoTest(obj);
		obj.threeTest(obj);
		obj.fourTest(obj);
	}
}