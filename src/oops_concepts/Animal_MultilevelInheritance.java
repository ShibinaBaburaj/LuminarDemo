package oops_concepts;

// Parent class

class DogA
{
	public void barking()
	{
		System.out.println("Dog is barking");
	}
}

// Child class 1

class CatA extends DogA
{
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
	}
}

// Child class 2

class Lion extends CatA
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}

public class Animal_MultilevelInheritance {
	
	// Multilevel inheritance

	public static void main(String[] args) {
		
		Lion l= new Lion();
		l.barking();
		l.sleeping();
		l.running();
	}

}
