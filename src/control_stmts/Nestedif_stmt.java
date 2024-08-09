package control_stmts;

public class Nestedif_stmt {

	public static void main(String[] args) {
		
		int age=3, weight=40;
		if (age>=18)
		{	
			if (weight>50)
			{	System.out.println("Eligible");	}
			else
			{	System.out.println("Ineligible: Under weight");	}
		}
		else
		{	System.out.println("Not eligible");		}
	}

}
