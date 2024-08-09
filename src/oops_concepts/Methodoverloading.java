package oops_concepts;

// Method overloading by Changing no:of arguments

public class Methodoverloading {
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b, int c)
	{
		int d= a+b+c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		Methodoverloading m= new Methodoverloading();
		m.add(5, 6);
		m.add(10, 20, 30);

	}

}
