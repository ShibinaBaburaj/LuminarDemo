package java_assignments;

import java.util.Scanner;

public class Q2Factorial {

	public static void main(String[] args) {
		
		int fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.print("Factorial of "+n+" is: ");
		
		do
		{
			fact= fact*n;
			n--;
		}
		while (n>0);
		System.out.println(fact);


	}

}
