
public class ToStringMethod {
	
	// toString() = special method that all objects inherit,
	//				that returns a string that "textually represents" an object.
	//				can be used both implicitly and explicitly

	public static void main(String[] args) {
		
		Car car = new Car();
		
//		System.out.println( car.make );
//		System.out.println( car.model );
//		System.out.println( car.color );
//		System.out.println( car.year );
		
		
		// Before add Method: public String toString()
		// Print address of car object in memory
		// return value: Car@54bedef2
		// System.out.println( car );
		// System.out.println( car.toString() );		
		
		// After add Method: public String toString()
		System.out.println( car.toString() );
		System.out.println();
		System.out.println( car );


	}

}
