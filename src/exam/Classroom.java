package exam;

public class Classroom {
	
	int rno;
	String name;
	int mark;
	
	public void store(int r, String name, int mrk)
	{
		rno=r;
		this.name=name;
		mark=mrk;
	}
	
	public void display()
	{
		System.out.println("Roll number:"+rno);
		System.out.println("Student Name:"+name);
		System.out.println("Mark:"+mark);
	}

	public static void main(String[] args) {
		
		Classroom c=new Classroom();
		c.store(12, "Abhishek", 100);
		c.display();
		
		System.out.println();
		
		c.store(15, "Archana", 98);
		c.display();
		
		

	}

}
