package array_programs;

import java.util.Scanner;

public class OneDiamArray_String {

	public static void main(String[] args) {
		
		int i;
		String a[]=new String[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the names");
		for (i=0;i<5;i++)
		{
			a[i]=sc.next();
		}
		
		System.out.println("The names entered are:");
		for (i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
