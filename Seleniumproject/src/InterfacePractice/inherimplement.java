package InterfacePractice;

public class inherimplement extends Inherpractice{

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
	public static void main(String[] args) {
		inherimplement im= new inherimplement();
		im.gear(5);
		im.gear("raja", "ram");
		im.gear(9);
		
	}

}
