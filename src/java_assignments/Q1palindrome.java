package java_assignments;

import java.util.Scanner;

public class Q1palindrome {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		int temp= num;  
		int rev=0;
		
		while(num!=0)
		{
			rev= rev*10 + num%10;	
			num= num/10;			
		}
		if (temp==rev)
		{
		System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
