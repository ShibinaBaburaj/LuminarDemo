package java_assignments;

public class Q7ArrayLargest {

	public static void main(String[] args) {
		
		int a[]= {56,89,560,4,100};
		int large=a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if (a[i]>large)
			{
				large=a[i];
			}
		}
		
		System.out.println("Largest number is: "+large);

	}

}
