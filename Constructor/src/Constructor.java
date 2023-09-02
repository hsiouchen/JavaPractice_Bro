
public class Constructor {
	
	// constructor = special method that is called 
	//               when an object is instantiated (created)

	public static void main(String[] args) {

		Human human1 = new Human("Lucy" , 65, 70);  // call constructor
		Human human2 = new Human("Mila" , 16, 50);  // call constructor
		
		System.out.println( human1.name );
		System.out.println( human2.name );

		human1.drink();
		human2.eat();
	}

}
