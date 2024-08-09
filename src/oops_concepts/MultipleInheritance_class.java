package oops_concepts;

interface Bank1
{
	void deposit();
	void withdraw();
}

interface Bank2
{
	void interestrate();
	void balancedetails();
}

class ICICI implements Bank1,Bank2
{

	@Override
	public void interestrate() {
		System.out.println("interest rate");
		
	}

	@Override
	public void balancedetails() {
		System.out.println("balance details");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit details");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdrawal details");
		
	}
	
}

public class MultipleInheritance_class {

	public static void main(String[] args) {

		ICICI i= new ICICI();
		i.interestrate();
		i.balancedetails();
		i.deposit();
		i.withdraw();

	}

}
