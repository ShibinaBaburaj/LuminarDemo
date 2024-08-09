package my_space;

import java.util.Scanner;

public class SumOfOddNos {
	
	public int sum(int n)
	{
		int sum=0;
		while(n>0)
		{
		if(n%2!=0)
		{
			sum=sum+n;
		}
		n--;
		}
		return sum;
	}

	public static void main(String[] args) {

		int n;
		System.out.println("Enter the limit");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		SumOfOddNos s= new SumOfOddNos();
		System.out.println(s.sum(n));
	}

}
