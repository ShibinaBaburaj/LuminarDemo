package java_assignments;

import java.util.Scanner;

public class Q6Prime {

	public static void main(String[] args) {
		
		int num,count=0;
		
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
			count++;
			}
		}
		
		if(count>2)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
	

	}

}
