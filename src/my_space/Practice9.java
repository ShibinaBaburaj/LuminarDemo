package my_space;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String a[]=new String[3];
		
		System.out.println("Enter the names");
		for (int i=0;i<3;i++)
		{
			a[i]=sc.next();
		}
		
		System.out.println("The names are:");
		for(String v:a)
		{
			System.out.println(v);
		}

	}

}
