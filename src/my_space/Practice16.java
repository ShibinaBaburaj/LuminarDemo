package my_space;

public class Practice16 {

	public static void main(String[] args) {
		
		int a[]= {52,450,65,100};
		int large=a[0];
		
		for(int i=0;i<4;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println(large);

	}

}
