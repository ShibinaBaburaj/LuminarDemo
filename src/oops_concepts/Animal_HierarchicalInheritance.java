package oops_concepts;

// Parent class

class DogB
{
	public void barking()
	{
		System.out.println("Dog is barking");
	}
}

// Child class 1

class CatB extends DogB
{
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
	}
}

// Child class 2

class LionA extends DogB
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}

// Hierarchical Inheritance

public class Animal_HierarchicalInheritance {

	public static void main(String[] args) {
		
		Cat c= new Cat();
		Lion l= new Lion();
		
		// Properties of Parent and child 1
		
		c.barking();
		c.sleeping();
		
		// Properties of Parent and child 2
		
		l.barking();
		l.running();

	}

}
