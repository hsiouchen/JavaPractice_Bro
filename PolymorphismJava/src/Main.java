
public class Main {
	
	// polymorphism = 	greek work for poly-"many", morph-"form"s
	//					The ability of an object to identify as more than one type
	
	public static void main(String[] args) {
		
		Car car = new Car();
		Bicycle bike = new Bicycle();
		Boat boat = new Boat();
		
//		Car[] racers = {car, bike, boat};
//		Bicycle[] racers = {car, bike, boat};
//		Boat[] racers = {car, bike, boat};
		Vehicle[] racers = {car, bike, boat};
		
//		car.go();
//		bike.go();
//		boat.go();
		
		for( Vehicle x : racers ) {
			x.go();
		}
		
		
	}
}
