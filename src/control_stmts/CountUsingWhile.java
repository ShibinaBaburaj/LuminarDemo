package control_stmts;

public class CountUsingWhile {

	public static void main(String[] args) {
		
		int count=0; 
		int input=1234;	
		
		while(input!=0)
		{
			input=input/10;
			count++;
		}
		System.out.println(count);
	}

}
