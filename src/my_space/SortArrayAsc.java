package my_space;

public class SortArrayAsc {

	public static void main(String[] args) {
		
		int a[]= {10,56,15,23,5};
		int i, j=a.length-1, temp;
		
		for(i=0;i<=a.length-1;i++)	
		{
			if(a[i]>a[j])	
			{
				temp=a[i];	
				a[i]=a[j];	
				a[j]=temp;	
			}
			System.out.println(a[i]);	
		}
		
	}

}
