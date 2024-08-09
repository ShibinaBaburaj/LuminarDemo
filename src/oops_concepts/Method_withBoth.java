package oops_concepts;

public class Method_withBoth {
	
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}

	public static void main(String[] args) {

	
		Method_withBoth ob= new Method_withBoth();
		System.out.println("Balance is:"+ ob.sub(20, 10));

	}

}
