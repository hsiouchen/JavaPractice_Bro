
public class Main {
	
	// Encapsulation = attributes of a class will be hidden or private,
	//				   Can be accessed only through methods (getters & setters)
	//
    // You should make attributes private if don't have a reason to make them public/protected

	public static void main(String[] args) {

		Car car1 = new Car("Chevrolet", "Camaro", 2023);
		//The field Car.make is not visible
		//System.out.println(car1.make);
		
		// getters()
//		System.out.println(car1.getMake());
//		System.out.println(car1.getModel());
//		System.out.println(car1.getYear());
		

		// setters()
//		car1.setMake("Telesa");
//		car1.setModel("Model X");
//		car1.setYear(2022);
//		System.out.println(car.getMake());
//		System.out.println(car.getModel());
//		System.out.println(car.getYear());

		//System.out.println(car1.toString());
		
		// ================
		//   Copy Object
		// ================
		System.out.println();
		
		Car car2 = new Car("Ford", "Mustang", 2022);
		
		// print out the addresses of car1 and car2 in memory
//		System.out.println(car1);
//		System.out.println(car2);
//		
//		car2 = car1;		
//		
//		System.out.println(car2.getMake());
//		System.out.println(car2.getModel());
//		System.out.println(car2.getYear());
		
	 
		// method: copy()
		car2.copy(car1);
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		
		// Copy constructor
		Car car3 = new Car(car1);
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getYear());

	}

}
