package my_space;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		System.out.println("Enter the operation number");
		System.out.println("1.Addition	2.Subtraction	3.Multiplication	4.Division");
		int op=sc.nextInt();
		
		switch(op)
		{
		case 1: System.out.println(n1+n2);
				break;
		case 2: System.out.println(n1-n2);
				break;
		case 3: System.out.println(n1*n2);
				break;
		case 4: System.out.println(n1/n2);
				break;
		default: System.out.println("Invalid entry");
		}

	}

}
