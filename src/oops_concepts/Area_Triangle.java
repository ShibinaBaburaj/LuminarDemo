package oops_concepts;

public class Area_Triangle {
	
	public float area()
	{
		float b=10.2f,h=12.1f;
		float ar= (float) (0.5*b*h);
		return ar;
	}

	public static void main(String[] args) {

		Area_Triangle ob= new Area_Triangle();
		System.out.println("Area of triangle is:" +ob.area());

	}

}
