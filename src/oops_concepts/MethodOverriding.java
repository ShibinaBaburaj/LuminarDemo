package oops_concepts;

class A
{
	public void m1()
	{
		int a=10;
		System.out.println(a);
	}
}

class B extends A
{
	public void m1()
	{
		int a=20;
		System.out.println(a);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		B ob= new B();
		ob.m1();
	}

}
