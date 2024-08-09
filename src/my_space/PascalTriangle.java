package my_space;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		
		System.out.println("Enter the no:of lines");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int number=1;
		int spaces=n;
		for(int i=0;i<n;i++)
		{
			for (int j=1; j<=spaces ;j++)
			{
				System.out.print(" ");
			}
			number=1;
			for(int k=0;k<=i;k++)
			{
				System.out.print(number + " ");
				number= number* (i-k)/(k+1);
			}
			spaces--;
			System.out.println();
		}
	}

}
