package my_space;

import java.util.Scanner;

public class CountOfEvens {
	
	public int evenCount(int n)
	{
		int count=0;
		while(n>0)
		{
			if (n%2==0)
			{
				count++;
			}
			n--;
		}
		return count;
	}

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit");
		n=sc.nextInt();
		CountOfEvens ce= new CountOfEvens();
		System.out.println(ce.evenCount(n));
	}

}
