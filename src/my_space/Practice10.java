package my_space;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements");
		int a[][]=new int[3][2];
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("The elements are:");
		for(int k[]:a)
		{
			for (int v:k)
			{
				System.out.print(v+" ");
			}
			System.out.println();
		}
	}

}
