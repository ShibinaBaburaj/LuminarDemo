package control_stmts;

public class Elseif_stmt {

	public static void main(String[] args) {
		
		int age=0;
		if (age>1 && age<18)
		{	System.out.println("Minor");	}
		else if (age>=18 && age<60)
		{	System.out.println("Major");	}
		else if (age>60)
		{	System.out.println("Retired");	}
		else
		{	System.out.println("Invalid data");	}
	}

}
