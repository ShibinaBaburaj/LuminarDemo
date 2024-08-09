package my_space;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		int temp= num;  // suppose the num=123
		int rev=0;
		
		while(num!=0)
		{
			rev= rev*10 + num%10;	//0+3=3			//30+2=32		//320+1=321
			num= num/10;			//123/10=12.3	//12.3/10=1.23	//1.23/10=0.123 exit the loop
		}
		if (temp==rev)
		{
		System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
