package my_space;

import java.util.Scanner;

public class DisplayPrimeNos {

	public static void main(String[] args) {
		
		int i, num, count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		num= sc.nextInt();
		
		for (i=1; i<=num; i++)
		{
			if (num%i==0)
			{
				count++;
			}
			
		}
		if (count>2)
		{
			System.out.println(i);
		}
	}

}
