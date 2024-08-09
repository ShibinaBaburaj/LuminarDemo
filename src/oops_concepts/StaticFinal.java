package oops_concepts;

class SchoolDetails
{
	final String schoolname="Luminar";
	static String department="English";
}

public class StaticFinal {

	public static void main(String[] args) {

		System.out.println(SchoolDetails.department);
		System.out.println(SchoolDetails.department="Malayalam");
		System.out.println(SchoolDetails.department);
		SchoolDetails s= new SchoolDetails();
		System.out.println(s.schoolname);
	//	System.out.println(s.schoolname="abc");		will be an error bcz final variable value can not be changed

	}

}
