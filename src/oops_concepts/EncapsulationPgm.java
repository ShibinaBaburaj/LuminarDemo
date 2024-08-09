package oops_concepts;

class Encap
{
	private String name;
	private String designation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}

public class EncapsulationPgm {

	public static void main(String[] args) {

		Encap e= new Encap();
		e.setName("Shibina");
		System.out.println(e.getName());
		e.setDesignation("Tester");
		System.out.println(e.getDesignation());

	}

}
