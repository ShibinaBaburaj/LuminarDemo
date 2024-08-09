package oops_concepts;

public class Method_WithParamtrWithoutRtntype {
	
	public void div(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		Method_WithParamtrWithoutRtntype ob= new Method_WithParamtrWithoutRtntype();
		ob.div(20, 10);

	}

}
