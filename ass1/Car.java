package ass1;

public class Car {
	public void applyBrake() {
	
		System.out.println("apply Break");
	}
	public void applyGear()  {
		System.out.println("apply Gear");
	}
	public void switchOnAc() {
		System.out.println("switch On Ac");
	}

 
 public static void main(String[] args) {
	 Car cr=new Car();
	 cr.applyBrake();
	 cr.applyGear();
	 cr.switchOnAc();
 }
 }
