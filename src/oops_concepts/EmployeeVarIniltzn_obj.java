package oops_concepts;

public class EmployeeVarIniltzn_obj {
	
	int empid;
	String empname;
	String designation;
	int deptno;
	
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(designation);
		System.out.println(deptno);
	}

	public static void main(String[] args) {
		
		EmployeeVarIniltzn_obj emp= new EmployeeVarIniltzn_obj();
		emp.empid=1;
		emp.empname="Ram";
		emp.designation="Tester";
		emp.deptno=2;
		emp.display();
		

	}

}
