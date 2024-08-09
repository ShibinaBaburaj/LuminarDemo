package my_space;

public class Practice11 {

	public static void main(String[] args) {
		
		int num=1231;
		int temp=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}

		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
