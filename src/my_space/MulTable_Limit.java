package my_space;

import java.util.Scanner;

public class MulTable_Limit {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number and limit");
		int num= sc.nextInt();
		int lim= sc.nextInt();
		
		for (int i=1;i<=lim;i++)
		{
			System.out.println(i+ "*" +num +"=" +(i*num));
		}

	}

}
