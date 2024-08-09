package exam;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		int len=str.length();
		
		System.out.println("Reversed String is:");
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

	}

}
