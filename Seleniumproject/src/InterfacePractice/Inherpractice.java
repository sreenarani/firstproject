package InterfacePractice;

public class Inherpractice {

	String color="blue";
	
	public void gear(int c) {
		System.out.println(c);
	}
	
	public void gear(String a, String b) {
		String e=a+b;
		System.out.println(e);
	}
	
	public void gear(float d) {
		System.out.println(d);
	}
	
		
	
	public static void main(String[] args)
	{
		Inherpractice ip= new Inherpractice();
		ip.gear(2);
		ip.gear("reena", "rani");
		ip.gear(4);
		
	}
	
	
	
	
	
	
}
