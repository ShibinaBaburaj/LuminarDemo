package my_space;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int n1=0,n2=1,n,temp;
		
		System.out.println("Enter the limit");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.print(n1+" "+n2);
		for(int i=2;i<n;i++)
		{
			temp=n1+n2;
			n1=n2;
			n2=temp;
			System.out.print(" "+temp);
		}

	}

}
