package my_space;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		int i;
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.next();
		
		int len=s.length();
		
		System.out.println("The reversed string is:");
		for(i=len-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
