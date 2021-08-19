//Assignment 7
/* 5. Create a class with an inner class that has 
a non-default constructor. Create a second class 
with an inner class that inherits from the first inner class.*/

class Outer1
{
	Outer1(String str)
	{
		System.out.println(str);
	}
	class Inner1
	{
	}
}
class Outer2 extends Outer1.Inner1 
{
	Outer2(Outer1 obj)
	{
		obj.super();
	}
	
	class Inner2
	{
	}
}
public class InnerOuterMain
{
	public static void main(String[] list)
	{
		Outer1 o1 = new Outer1("Hello");
		Outer2 o2 = new Outer2(o1);
	}
}