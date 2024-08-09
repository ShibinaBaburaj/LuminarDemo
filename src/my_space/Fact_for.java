package my_space;

public class Fact_for {

	public static void main(String[] args) {
		int i,n=5,fact=1;
		
		for(i=n;i>=1;i--)
		{
			fact= fact*n;
			n--;
		}
		System.out.println(fact);

	}

}
