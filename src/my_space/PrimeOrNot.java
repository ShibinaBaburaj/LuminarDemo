package my_space;

import java.util.Scanner;

public class PrimeOrNot {
	
	// Prime is a number that is only divisible by 1 and itself...eg. 1,2,3,5,7,11..

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
