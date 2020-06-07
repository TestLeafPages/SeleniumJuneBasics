package week1.day2;

public class LearnMethods {

	public void closeCarDoor() {
		System.out.println("Car Door Closed");
	}
	public int getFuelCapacity() {
		System.out.println("Getting fuel Capacity");
		int fuelCapacity = 26;
		return fuelCapacity;
	}
	public int addTwoNumbers(int a, int b) {
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		obj.closeCarDoor();
		int capacity = obj.getFuelCapacity();
		System.out.println(capacity);
		System.out.println(obj.getFuelCapacity());
		System.out.println(obj.addTwoNumbers(16, 9));
		int sum = obj.addTwoNumbers(10, 20);
		System.out.println(sum);
		
		
		
		
		
		
		
		
	}
}
