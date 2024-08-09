package string_functions;

import java.util.Scanner;

public class StringContains_practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the statement:");
	    String s=sc.nextLine();
	    System.out.println(s.contains("language"));
	    if(s.contains("language"))
	    {
	    	System.out.println("Pass");
	    }
	    else
	    {
	    	System.out.println("Fail");
	    }
	    }

}
