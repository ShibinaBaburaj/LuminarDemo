package array_programs;

import java.util.Scanner;

public class OneDArray_ForEach {

	public static void main(String[] args) {
		
		String arr[]= new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the names");
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("The names are:");
		for(String s:arr)
		{
			System.out.println(s);
		}
	}

}
