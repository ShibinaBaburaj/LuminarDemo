package control_stmts;

public class OddNumPrint_dowhile {

	public static void main(String[] args) {
		int n=1;
		do
		{
			if(n%2==1)
				System.out.println(n);
			n++;
		}
		while(n<=10);

	}

}
