package oops_concepts;

public class Area_Circle {
	
	public float area(int r)
	{
		float ar= (float) (3.14*r*r);
		return ar;
	}

	public static void main(String[] args) {
		
		Area_Circle ob= new Area_Circle();
		System.out.print(ob.area(3));

	}

}
