package oops_concepts;

class Parent
{
	String name="abc";	//Using super keyword for calling instance variable
	void phone()
	{	
			System.out.println("Nokia");
	}
}

class Child extends Parent
{
	void phone()
	{
		System.out.println(super.name);
		System.out.println("iphone");
		super.phone();
	}
}

public class Methodoverriding_Super {

	public static void main(String[] args) {
		
		Child ob= new Child();
		ob.phone();
		
	}

}
