package control_stmts;

public class Practice_swapvthout_var {

	public static void main(String[] args) {
		int a=2,b=7;
		System.out.println("Value of a is:" +a);
		System.out.println("Value of b is:" +b);
		a=a+b;	//a=9
		b=a-b;	//b=9-7=2
		a=a-b;	//a=9-2=7
		System.out.println("Swaped value of a is:" +a);
		System.out.println("Swaped value of b is:" +b);
	}

}
