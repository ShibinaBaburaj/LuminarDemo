package control_stmts;

public class StarPrinting_nestedFor {

	public static void main(String[] args) {
		int i, j;
		for(i=1;i<=3;i++)
		{
			for(j=0;j<=4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
