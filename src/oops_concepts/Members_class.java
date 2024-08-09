package oops_concepts;

class Members
{
	String name;
	int age;
	String address;
	int salary;
	public void printdetails()
	{
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Address: "+ address);
		System.out.println("Salary: "+ salary);
	}
}

class Worker extends Members
{
	String specialization;
}

class Manager extends Members
{
	String department;
}



public class Members_class {

	public static void main(String[] args) {
		
		Members me= new Members();
		me.name="Raju";
		me.age=20;
		me.address="ABC Villa";
		me.salary=12000;
		me.printdetails();
		Worker w= new Worker();
		System.out.println("Specialization: "+ (w.specialization="Testing"));
		Manager m= new Manager();
		System.out.println("Department: "+(m.department="Software"));
		

	}

}
