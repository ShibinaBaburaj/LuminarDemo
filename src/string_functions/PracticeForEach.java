package string_functions;

import java.util.Scanner;

public class PracticeForEach {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		String s[]=str.split(" ");
		for (String s1:s)
		{
			System.out.println(s1);
		}
		
		System.out.println("Enter the 2nd string");
		String stg=sc.next();
		char st[]=stg.toCharArray();
		for (char s1:st)
		{
			System.out.println(s1);
		}
	}

}
