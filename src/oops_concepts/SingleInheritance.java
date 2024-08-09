package oops_concepts;

// Parent class

class Dog
{
	public void barking()
	{
		System.out.println("Dog is barking");
	}
}

// Child class

class Cat extends Dog
{
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
	}
}

// Single Inheritance

public class SingleInheritance {
	
	

	public static void main(String[] args) {
		
		Cat c=new Cat();
		c.barking();
		c.sleeping();
	}

}
