package oops_concepts;

// Method overloading by changing the order of the data type

public class Methodoverloading_ordr {
	
	public void add(int a, double b)
	{
		double c= a+b;
		System.out.println(c);
	}
	
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		Methodoverloading_ordr b= new Methodoverloading_ordr();
		b.add(5, 2.6);
		b.add(6.2, 5);

	}

}
