package my_space;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		System.out.print("The reversed array is: ");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		

	}

}
