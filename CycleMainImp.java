//Assignment - 7
/* 4. Create a Cycle1 interface, with implementations Unicycle1,
 Bicycle1 and Tricycle1. Create factories for each type of Cycle,
 and code that uses these factories. */
 import java.util.Scanner;
 interface Cycle1
 {
	void display();
 }
 class Unicycle1 implements Cycle1
 {
	 @Override
	 public void display()
	 {
		 System.out.println("Unicycle1 object created");
		 System.out.println("Inside Unicycle1");
	 }
 }
 class Bicycle1 implements Cycle1
 {
	 @Override
	 public void display()
	 {
		 System.out.println("Bicycle1 object created");
		 System.out.println("Inside Bicycle1");
	 }
 }
 class Tricycle1 implements Cycle1
 {
	 @Override
	 public void display()
	 {
		 System.out.println("Tricycle1 object created");
		 System.out.println("Inside Tricycle1");
	 }
 }
 class UnicycleFactory
 {
	 public static Cycle1 getInstance()
	 {
		 
		return new Unicycle1();
	 }
 }
 class BicycleFactory
 {
	 public static Cycle1 getInstance()
	 {
		 
		 return new Bicycle1();
		
	 }
 }
 class TricycleFactory
 {
	 public static Cycle1 getInstance()
	 {
		
		return new Tricycle1();
	 }
 }
 class CycleMainImp
 {
	public static void main(String args[])
	{
		Cycle1 ref;
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Which class object do you want?");
		name = sc.nextLine();
		if(name.equalsIgnoreCase("unicycle"))
			ref = UnicycleFactory.getInstance();
		else if(name.equalsIgnoreCase("bicycle"))
			ref = BicycleFactory.getInstance();
		else 
			ref = TricycleFactory.getInstance();
		ref.display();
		sc.close();
	}
 }
 