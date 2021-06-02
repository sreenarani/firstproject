package InterfacePractice;

import All.IndianRules;
import All.Rules;

public class AustralianTraffic implements Rules, IndianRules {

	public static void main(String[] args) {
		
		AustralianTraffic a= new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.yellowWait();
		a.walking();
		
		IndianRules ir= new AustralianTraffic();
		ir.train();
	}

	@Override
	public void greenGo() {
		System.out.println("Green for Go");
		
	}

	public void walking() {
		System.out.println("local walking");
		
	}
	@Override
	public void yellowWait() {
		System.out.println("Yellow for wait");
	}

	@Override
	public void redStop() {
		System.out.println("Red for Stop");
		
	}

	@Override
	public void train() {
		System.out.println("Indian train rules");
	}

}
