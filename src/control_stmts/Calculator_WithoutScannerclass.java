package control_stmts;

public class Calculator_WithoutScannerclass {

	public static void main(String[] args) {
		int a=10, b=5;
		int calc=2;
		switch(calc)
		{
		case 1: System.out.println("Addition:"+a+b);
				break;
		case 2: System.out.println("Subtraction:"+(a-b));
				break;
		case 3: System.out.println("Multiplication:"+a*b);
				break;
		case 4: System.out.println("Division:"+a/b);
				break;
		default: System.out.println("Invalid entry"); 
		}
	}

}
