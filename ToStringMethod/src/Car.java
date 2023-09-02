
public class Car {

	String make;
	String model;
	String color;
	int year;
	
	Car() {
		make = "Ford";
		model = "Mustang";
		color = "red";
		year = 2021;
	}
	
	public String toString() {
//		String myString = make+"\n"+model+"\n"+color+"\n"+year;		
//		return myString;
		return make+"\n"+model+"\n"+color+"\n"+year;
	}
	
}
