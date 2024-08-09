package array_programs;

import java.util.Scanner;

public class OneDiamArray_Example {

	public static void main(String[] args) {
		
		int i;
		Scanner sc= new Scanner(System.in);
		int a[]=new int[6];
		
		System.out.println("Enter the array elements:");
		for(i=0;i<6;i++)
		{
			a[i]= sc.nextInt();
		}
		
		System.out.println("The array elements are:");
		for (i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}
	}

}
