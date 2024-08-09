package oops_concepts;

// Overloading by changing data type

public class Methodoverloading_dt {
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}
		


	public static void main(String[] args) {

		Methodoverloading_dt m= new Methodoverloading_dt();
		m.add(10, 20);
		m.add(20, 50.5);
	}

}
