import java.util.Scanner;

public class Main {
	
	// dynamic - polymorphism
	// ----------------------
	// polymorphism = 	many shapes / forms
	// dynamic      = 	after compilation (during runtime)
	
	// ex. A Ford is a: Ford, and a car, and a vehicle, and an object
	
	// Inheritance Extends from parents class

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		
		Animal animal;
		
		System.out.println("Whar animal do you want? cat or dog");
		System.out.println("(1=dog) or (2=cat) : ");
		int choice = scan.nextInt();
		

		if ( choice == 1) {
			animal = new Dog();
			animal.speak();
		}
		else if ( choice == 2 ) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("That choice was invalid");
			animal.speak();
		}
		

		scan.close();

	}

}
