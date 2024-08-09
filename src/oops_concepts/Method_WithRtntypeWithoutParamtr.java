package oops_concepts;

public class Method_WithRtntypeWithoutParamtr {
	
	public int mul()
	{
		int a=20,b=10;
		int c=a*b;
		return c;
	}

	public static void main(String[] args) {
		
		Method_WithRtntypeWithoutParamtr ob= new Method_WithRtntypeWithoutParamtr();
		System.out.println("Product is:"+ ob.mul());

	}

}
