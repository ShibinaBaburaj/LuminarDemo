package exam;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.print("Swapped values are:"+num1+" "+num2);
		

	}

}
