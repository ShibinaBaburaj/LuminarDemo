package oops_concepts;

abstract class Google
{
	static int a=30;			// static variable can also be used in abstract class
	abstract void message();
	public void search()
	{
		System.out.println("Search details");
	}
}

class SearchAll extends Google
{

	@Override
	void message() {
		System.out.println("Search all results");
		
	}
	
}

class SearchImage extends Google
{

	@Override
	void message() {
		System.out.println("Search all Images");
		
	}
	
}

class SearchVideo extends Google
{

	@Override
	void message() {
		System.out.println("Search all Videos");
		
	}
	
}

public class Abstract_Class {

	public static void main(String[] args) {
		
		SearchAll sa= new SearchAll();
		sa.search();
		sa.message();
		SearchImage si= new SearchImage();
		si.search();
		si.message();
		SearchVideo sv= new SearchVideo();
		sv.search();
		sv.message();
		System.out.println(Google.a);				// class name is used to call static variable

	}

}
