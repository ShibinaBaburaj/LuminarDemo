package basics;

public class Logical_operators {

	public static void main(String[] args) {
		boolean x=true, y=false;
	/*	System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);		*/
		
		String username="abc";
		String password="abcd3";
		System.out.println(username=="abc"&& password=="abcd");
		System.out.println(username=="abc"&& password=="abcd3");
		System.out.println(username=="abc"|| password=="abcd");
		System.out.println(!(username=="abc"));
	}

}
