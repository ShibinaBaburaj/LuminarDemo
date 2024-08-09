package control_stmts;

import java.util.Scanner;

public class Calculator_WithScannerclass {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.println("Enter the operation:");
		System.out.println("1. Addition  2. Subtraction  3. Multiplication  4. Division");
		int op= sc.nextInt();
		switch(op)
		{
		case 1: System.out.println(a+"+"+b+"="+(a+b));
				break;
		case 2: System.out.println(a+"-"+b+"="+(a-b));
				break;
		case 3: System.out.println(a+"*"+b+"="+(a*b));
				break;
		case 4: System.out.println(a+"/"+b+"="+(a/b));
				break;
		default: System.out.println("Invalid entry"); 
		}
		}

}
