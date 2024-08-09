package oops_concepts;

interface BasicAnimal
{
	void cat();
	void sleep();
}

class Monkey
{
	void jump()
	{
		System.out.println("Jump");
	}
	void bite()
	{
		System.out.println("Bite");
	}
}

class Human extends Monkey implements BasicAnimal
{
	void speak()
	{
		System.out.println("Speak");
	}

	@Override
	public void cat() {
		System.out.println("Cat");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleep");
		
	}
}

public class InterfacePgm {

	public static void main(String[] args) {
		
		Human h= new Human();
		h.jump();
		h.bite();
		h.speak();
		h.cat();
		h.sleep();

	}

}
