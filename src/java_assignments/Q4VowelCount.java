package java_assignments;

import java.util.Scanner;

public class Q4VowelCount {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		int count=0;
		
		for (int i =0; i<str.length();i++)
		{
			char c= str.charAt(i);
			
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
			{
				count++;
			}
		}

		System.out.println("No:of vowels in the string: "+count);

	}

}
