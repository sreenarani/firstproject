package InterfacePractice;

public class Indianaircraft extends AbparentAircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Indianaircraft ic= new Indianaircraft ();
ic.safetyGuidelines();
ic.engine();
ic.bodyColor();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("indian aircraft");
	}

}
