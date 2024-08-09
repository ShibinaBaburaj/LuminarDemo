package java_assignments;

public class Q8IntegerArrayReverse {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		System.out.println("The reversed array is: ");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}

	}

}
