package oops_concepts;

public class ParameterizedConstructor {
	
	int empid;
	int salary;
	String designation;
	
	// Constructor with different argument names
	/*
	public ParameterizedConstructor(int id,int sal,String desig)
	{
		empid=id;
		salary=sal;
		designation=desig;
	}	*/
	
	// Constructor with same argument names
	
	public ParameterizedConstructor(int empid,int salary,String designation)
	{
		this.empid=empid;
		this.salary=salary;
		this.designation=designation;
	}	

	public static void main(String[] args) {

		ParameterizedConstructor p= new ParameterizedConstructor(12, 25000, "Developer");
		System.out.println(p.empid);
		System.out.println(p.salary);
		System.out.println(p.designation);

	}

}
