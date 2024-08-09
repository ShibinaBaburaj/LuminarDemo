package exam;

interface Principal
{
	void resign();
	void rejoin();
}

class Student
{
	int sci,mat,eng;
	String name;
	
	public void mark(String n,int s, int m, int e)
	{
		name=n;
		sci=s;
		mat=m;
		eng=e;
	}
	
	public void showdetails()
	{
		System.out.println("Student name:"+name);
		System.out.println("Marks are listed:");
		System.out.println("Science:"+sci);
		System.out.println("Maths:"+mat);
		System.out.println("English:"+eng);
	}
}

class Teacher extends Student implements Principal
{
	public void department()
	{
		System.out.println("Science Department");
	}

	@Override
	public void resign() {
		System.out.println("Resign Details");
		
	}

	@Override
	public void rejoin() {
		System.out.println("Rejoin Details");
		
	}
	
}

public class School {

	public static void main(String[] args) {
		
		Teacher t= new Teacher();
		t.mark("Anu", 80, 75, 90);
		t.department();
		System.out.println();
		
		t.showdetails();
		System.out.println();
		
		t.resign();
		t.rejoin();
		

	}

}
