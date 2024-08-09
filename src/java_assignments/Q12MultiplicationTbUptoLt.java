package java_assignments;

import java.util.Scanner;

public class Q12MultiplicationTbUptoLt {

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
