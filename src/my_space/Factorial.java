package my_space;

public class Factorial {

	public static void main(String[] args) {
		
		int n=5, fact=1;
		
		while(n!=0)
		{
			fact= fact*n;
			n--;
		}
		System.out.println(fact);
	}

}
