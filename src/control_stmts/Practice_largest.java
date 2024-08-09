package control_stmts;

public class Practice_largest {

	public static void main(String[] args) {
		int a=60, b=30, c=40;
		if (a>b && a>c)	//20>30
		{ System.out.println("Largest is: "+a);	}
		else if(b>a && b>c)	//30>10
		{	System.out.println("Largest is: "+b);	}
		else
		{	System.out.println("Largest is: "+c);	}
	}

}
