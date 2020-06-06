package week1.day1;

public class Mobile {
// datatype variablename = value;
	short ramSize = 6 ;
	int number = 908765432 ;
	long phoneNumber = 9715974750L ;
	float modelNumber = 123.9876f ;
	double imei = 9.0807060504 ;
	char version = 'P' ;
	boolean isMobileCharged = false ;
	String modelName = "Redmi K20 Pro";
	
	public static void main(String[] args) {
		// Syntax to create an object for a class
		Mobile object = new Mobile();
		// To access the variables using the object
		System.out.println(object.ramSize);
		System.out.println(object.modelName);
	}
	
	
	

}
