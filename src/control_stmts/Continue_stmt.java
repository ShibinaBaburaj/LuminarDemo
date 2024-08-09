package control_stmts;

public class Continue_stmt {

	public static void main(String[] args) {
		
		for (int i=1;i<=10;i++)
		{
			if (i==5)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
