package oops_concepts;

public class EmployeeMethod {
	
	int empid;
	int salary;
	String designation;
	
	// Program using this keyword
	
/*	public void setvalues(int empid, int salary, String designation)
	{
		this.empid=empid;
		this.salary=salary;
		this.designation=designation;	
	}	*/
	
	// Program using different names for instance variable and arguments
	
	public void setvalues(int id, int sal, String desig)
	{
		empid=id;
		salary=sal;
		designation=desig;
	}
	
	public void display()
	{
		System.out.println("Employee id: "+empid);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee designation: "+designation);
	}

	public static void main(String[] args) {
		EmployeeMethod em= new EmployeeMethod();
		em.setvalues(1, 30000, "Tester");
		em.display();
	}

}
