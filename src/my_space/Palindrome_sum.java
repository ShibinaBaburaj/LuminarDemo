package my_space;

import java.util.Scanner;

public class Palindrome_sum {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		int temp=num; int sum=0;
		int rev=0; 
		
		while(num!=0)
		{
			rev= rev*10 + num%10;
			num= num/10;		
		}
		
		if (temp==rev)
		{
			while(temp!=0)		//rev=121
			{
				rev=temp%10;	//1		2		1
				temp=temp/10;	//12	1		0
				sum= sum+rev;	//1		1+2=3	3+1=4
			}
			System.out.println(sum);
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
