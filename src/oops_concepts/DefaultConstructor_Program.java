package oops_concepts;

public class DefaultConstructor_Program {
	
	// Define instance variables 
	
	int empid;
	int salary;
	String designation;
	
	// Default constructor
	
	public DefaultConstructor_Program()
	{
		empid=1;
		salary=50000;
		designation="Tester";
	}

	public static void main(String[] args) {
		
		DefaultConstructor_Program p= new DefaultConstructor_Program();
		System.out.println(p.empid);
		System.out.println(p.salary);
		System.out.println(p.designation);
		

	}

}
