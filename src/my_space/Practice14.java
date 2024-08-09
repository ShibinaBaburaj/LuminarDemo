package my_space;

public class Practice14 {

	public static void main(String[] args) {
		
		String str="assignment";
		int len=str.length();
		int count=0;
		
		for(int i=0;i<len;i++)
		{
			char c=str.charAt(i);
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				count++;
			}
		}

		System.out.println(count);
	}

}
