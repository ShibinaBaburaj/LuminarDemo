package control_stmts;

public class Fibonacci_series {

	public static void main(String[] args) {
		
		int i,n1=0,n2=1,n3;
		
		System.out.print(n1+" ");
		System.out.print(n2+" ");
	
		for (i=2; i<10; i++)
		{
		n3=n1+n2;	
		System.out.print(n3+" ")	;
		n1=n2;
		n2=n3;
		}
	}

}
