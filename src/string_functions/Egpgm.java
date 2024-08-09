package string_functions;

public class Egpgm {

	public static void main(String[] args) {
	// find length of the string
		String s="Welcome";
		System.out.println(s.length());
		int w=s.length();
		System.out.println(w);
	
	// Join two strings
		String s1="hello";
		String s2=" Luminar";
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2);
		System.out.println(s1+1+2);
		System.out.println(1+2+s1);
		
	// Case conversion
		String s5= "Luminar";
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		System.out.println(s5.startsWith("u"));
		System.out.println(s5.endsWith("r"));
		
	// Comparing Strings
		String a="abc";
		String b="Abc";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
	// String Trimming to remove white spaces
		String q="   hello ";
		System.out.println(q);
		System.out.println(q.trim());
		
	// Extracting a portion of the string
		String y="Welcome";
		System.out.println(y.substring(3));
		System.out.println(y.substring(0,6));
		
	// Check if it contains the specified string
		String x="Welcome to Luminar";
		System.out.println(x.contains("luminar"));
		System.out.println(x.contains("Luminar"));
		
	// To replace a string
		System.out.println(x.replace("el","xy"));
		
	// To display the character at the specified position
		String z="welcome";
		System.out.println(z.charAt(3));
		
	// To split the string entered
		String w1= "Welcome to Luminar";
		String words[]=w1.split(" ");
		for(String l:words)
		{
			System.out.println(l);
		}
		
	// To split characters in a string
		String t="hello";
		char c1[]=t.toCharArray();
		for(char v:c1)
		{
			System.out.println(v);
		}
	}

}
