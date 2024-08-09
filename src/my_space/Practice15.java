package my_space;

public class Practice15 {

	public static void main(String[] args) {
		
		int num=15;
		int count=0;
		
		for (int i=1;i<=num;i++)
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("Prime");
		}
	}

}
