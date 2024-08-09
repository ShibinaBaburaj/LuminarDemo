package oops_concepts;

interface Whatsappcalls
{
	int a=10;
	void calls();
	void mute();
	void disconnect();
}

class Audiocalls implements Whatsappcalls
{

	@Override
	public void calls() {
		System.out.println("Whatsapp calls");
		
	}

	@Override
	public void mute() {
		System.out.println("Whatsapp calls muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Whatsapp calls disconnected");
		
	}
}

class Videocalls implements Whatsappcalls
{

	@Override
	public void calls() {
		System.out.println("Video calls");
		
	}

	@Override
	public void mute() {
		System.out.println("Video calls muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Video call disconnected");
		
	}
	
}

public class Interface_class {

	public static void main(String[] args) {
		
		// Method1
		
		/*Audiocalls a= new Audiocalls();
		a.calls();
		a.mute();
		a.disconnect();
		Videocalls v= new Videocalls();
		v.calls();
		v.mute();
		v.disconnect();*/
		
		// Method2
		Whatsappcalls ob= new Audiocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		ob= new Videocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		
		System.out.println(Whatsappcalls.a);

	}

}
