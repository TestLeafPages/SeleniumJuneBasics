package week3.day1;
// final class cannot be extended
public class Audi extends Car{
	public void applyBrake() {
		System.out.println("Apply ABS brake");
	}
	// Final method can not be overridden
	public void turnOffCar() {
		System.out.println("Car off");
	}
	// static method can not be overridden
	public void startCar() {
		System.out.println("Ignition start");
	}


}
