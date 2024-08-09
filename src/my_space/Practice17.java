package my_space;

public class Practice17 {

	public static void main(String[] args) {
		
		int a[]= {50,23,79,41,12};
		int temp;
		
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
			System.out.println(a[i]);
		}

	}

}
