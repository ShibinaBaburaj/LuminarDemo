package control_stmts;

import java.util.Scanner;

public class ScannerClass_Example {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter a character");
		char c=sc.next().charAt(0);
		
		System.out.println(age+" "+name+" "+c);
	}

}
