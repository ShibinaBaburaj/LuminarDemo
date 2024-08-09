package java_assignments;

public class Q9SortArrayAsc {

	public static void main(String[] args) {
		
		int a[]= {10,56,15,23,5};
		int temp;
		
		System.out.println("Sorted array is:");
		for(int i=0;i<a.length;i++)	
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j])	
			{
				temp=a[i];	
				a[i]=a[j];	
				a[j]=temp;	
			}}
			System.out.print(a[i]+ " ");	
		}

	}

}
