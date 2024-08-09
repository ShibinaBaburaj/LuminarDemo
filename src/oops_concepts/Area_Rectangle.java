package oops_concepts;

public class Area_Rectangle {
	
	public void area(int l, int b)
	{
		int ar= l*b;
		System.out.println(ar);
	}

	public static void main(String[] args) {

		Area_Rectangle ob= new Area_Rectangle();
		System.out.print("Area of Rectangle is: ");
		ob.area(5, 4);
	}

}
