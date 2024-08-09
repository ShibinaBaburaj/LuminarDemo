package oops_concepts;

class Car
{
	public void speed()
	{
		System.out.println("Car speed");
	}
	public void power()
	{
		System.out.println("Car power");
	}
}

class Bmw extends Car
{

	@Override
	public void speed() {
		System.out.println("Bmw speed");
		super.speed();
	}

	@Override
	public void power() {
		System.out.println("Bmw power");
		super.power();
	}
	
}

public class Methodoverriding_annotation {

	public static void main(String[] args) {

		Bmw b= new Bmw();
		b.power();
		b.speed();

	}

}
